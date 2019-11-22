package com.song.video_pay.service;

import com.song.video_pay.domain.User;

/**
 * 用户业务接口类
 */
public interface UserService {

    User saveWechatUser(String code);
}
