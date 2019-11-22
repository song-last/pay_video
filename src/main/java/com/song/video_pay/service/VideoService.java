package com.song.video_pay.service;

import com.song.video_pay.domain.Video;

import java.util.List;

/**
 * 视频业务接口类
 */
public interface VideoService {

    List<Video> getAll();

    Video findById(int id);

    int update(Video video);

    int delete(int id);

    int save(Video video);
}
