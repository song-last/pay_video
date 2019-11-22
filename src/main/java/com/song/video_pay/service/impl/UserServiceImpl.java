package com.song.video_pay.service.impl;

import com.song.video_pay.config.WeChatConfig;
import com.song.video_pay.domain.User;
import com.song.video_pay.mapper.UserMapper;
import com.song.video_pay.service.UserService;
import com.song.video_pay.utils.HttpUtils;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private WeChatConfig weChatConfig;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User saveWechatUser(String code) {

        String accessTokenUrl = String.format(WeChatConfig.getOpenAccessTokenUrl(),weChatConfig.getOpenAppid(),weChatConfig.getOpenAppsecret(),code);

        //获取access_token
        Map<String ,Object> baseMap =  HttpUtils.doGet(accessTokenUrl);

        if(baseMap == null || baseMap.isEmpty()){ return  null; }
        String accessToken = (String)baseMap.get("access_token");
        String openId  = (String) baseMap.get("openid");

        User dbUser = userMapper.findByopenid(openId);

        if(dbUser!=null) { //更新用户，直接返回
            return dbUser;
        }

        //获取用户基本信息
        String userInfoUrl = String.format(WeChatConfig.getOpenAccessUserUrl(),accessToken,openId);
        //获取access_token
        Map<String ,Object> baseUserMap =  HttpUtils.doGet(userInfoUrl);

        if(baseUserMap == null || baseUserMap.isEmpty()){ return  null; }
        String nickname = (String)baseUserMap.get("nickname");

        Double sexTemp  = (Double) baseUserMap.get("sex");
        Double sextemp  = (Double) baseUserMap.get("sex");
        int sextemp1 = sextemp.intValue();
        long sex = Long.parseLong(sextemp1 + "");
        String province = (String)baseUserMap.get("province");
        String city = (String)baseUserMap.get("city");
        String country = (String)baseUserMap.get("country");
        String headimgurl = (String)baseUserMap.get("headimgurl");
        StringBuilder sb = new StringBuilder(country).append("||").append(province).append("||").append(city);
        String finalAddress = sb.toString();
        try {
            //解决乱码
            nickname = new String(nickname.getBytes("ISO-8859-1"), "UTF-8");
            finalAddress = new String(finalAddress.getBytes("ISO-8859-1"), "UTF-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        User user = new User();
        user.setName(nickname);
        user.setHead_img(headimgurl);
        user.setCity(finalAddress);
        user.setOpenid(openId);
        user.setSex(sex);
        user.setCreate_time(new Date());
        userMapper.save(user);
        return user;
    }
}
