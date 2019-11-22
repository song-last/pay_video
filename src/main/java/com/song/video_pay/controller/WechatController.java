package com.song.video_pay.controller;

import com.song.video_pay.config.WeChatConfig;
import com.song.video_pay.domain.JsonData;
import com.song.video_pay.domain.User;
import com.song.video_pay.service.UserService;
import com.song.video_pay.utils.JwtUtils;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.cs.ext.GBK;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/api/v1/wechat")
public class WechatController {

    @Autowired
    private WeChatConfig weChatConfig;

    @Autowired
    private UserService userService;

    /**
     * 拼装微信扫一扫登录url
     * @return
     */
    @GetMapping("login_url")
    @ResponseBody
    public JsonData loginUrl(@RequestParam(value = "access_page",required = true)String accessPage) throws UnsupportedEncodingException {

        String redirectUrl = weChatConfig.getOpenRedirectUrl();   //获取开放平台重定向地址

        String callbackUrl = URLEncoder.encode(redirectUrl, "GBK"); //进行编码

        String qrcodeUrl = String.format(weChatConfig.getOpenQrcodeUrl(),weChatConfig.getOpenAppid(),callbackUrl,accessPage);   //拼接url（回调地址,当前页）

        return JsonData.buildSuccess(qrcodeUrl);
    }

    /**
     *用户扫码登录页面
     * @param code
     * @param state
     * @param response
     * @throws IOException
     */
    @GetMapping("/user/callback")
    public void wechatUserCallback(@RequestParam(value = "code",required = true) String code,
                                   String state,
                                   HttpServletResponse response) throws IOException {
        User user = userService.saveWechatUser(code);
        if(user != null){
            //生成jwt
            String token = JwtUtils.geneJsonWebToken(user);
            //可以带user的基本信息参数
            response.sendRedirect("http://" + state + "?token=" + token);
        }
    }

}
