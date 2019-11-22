package com.song.video_pay.service.impl;

import com.song.video_pay.domain.Video;
import com.song.video_pay.mapper.VideoMapper;
import com.song.video_pay.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 视频业务类
 */
@Service
public class VideoServiceImpl implements VideoService{

    @Autowired
    private VideoMapper videoMapper;

    /**
     *获取所有的video
     * @return
     */
    @Override
    public List<Video> getAll() {
        return videoMapper.getAll();
    }

    /**
     * 通过id获取video
     * @param id
     * @return
     */
    @Override
    public Video findById(int id) {
        return videoMapper.findById(id);
    }

    /**
     * 更新video
     * @param video
     * @return
     */
    @Override
    public int update(Video video) {
        return videoMapper.update(video);
    }

    /**
     * 通过id删除video
     * @param id
     * @return
     */
    @Override
    public int delete(int id) {
        return videoMapper.delete(id);
    }

    @Override
    public int save(Video video) {
        return videoMapper.save(video);
    }
}
