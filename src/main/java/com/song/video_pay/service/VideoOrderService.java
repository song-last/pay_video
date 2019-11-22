package com.song.video_pay.service;

import com.song.video_pay.domain.Video_order;
import com.song.video_pay.dto.VideoOrderDto;

/**
 * 订单接口
 */
public interface VideoOrderService {

    /**
     * 下单接口
     * @param videoOrderDto
     * @return
     */
    Video_order save(VideoOrderDto videoOrderDto);
}
