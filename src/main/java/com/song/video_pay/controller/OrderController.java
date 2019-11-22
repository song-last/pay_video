package com.song.video_pay.controller;

import com.song.video_pay.domain.JsonData;
import com.song.video_pay.service.VideoOrderService;
import com.song.video_pay.utils.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 订单接口
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private VideoOrderService videoOrderService;

    @GetMapping("add")
    public JsonData saveOrder(@RequestParam(value = "video_id",required = true) int video_id,
                              HttpServletRequest request){
        //获取用户的ip
        String ip = IpUtils.getIpAddr(request);
//        int userId = (int) request.getAttribute("user_id");
        int user_id = 1;

        return JsonData.buildSuccess("下单成功");
    }
}
