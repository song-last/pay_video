package com.song.video_pay.controller;

import com.song.video_pay.config.WeChatConfig;
import com.song.video_pay.domain.JsonData;
import com.song.video_pay.domain.Video;
import com.song.video_pay.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    WeChatConfig weChatConfig;

    @GetMapping("wxpayTest")
    public String wxpayTest(){
        System.out.println(weChatConfig.getAppid());
        return "success";
    }

    @Autowired
    private VideoMapper videoMapper;

    @GetMapping("dbTest")
    public Object dbTest(){
        List<Video> videos = videoMapper.getAll();
        JsonData data = JsonData.buildSuccess(videos);
        return data;
    }
}
