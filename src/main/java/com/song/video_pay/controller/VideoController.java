package com.song.video_pay.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.song.video_pay.domain.Video;
import com.song.video_pay.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * 获取所有的video
     * @param pageNum 当前页
     * @param size 每页有多少个
     * @return
     */
    @GetMapping("getAll")
    public Object getAll(@RequestParam(value = "pageNum",defaultValue = "1")int pageNum,
                         @RequestParam(value = "size",defaultValue = "10")int size){
        PageHelper.startPage(pageNum,size);
        List<Video> videos = videoService.getAll();
        PageInfo<Video> pageInfo = new PageInfo<>(videos);
        Map<String,Object> data = new HashMap<>();
        data.put("total_size",pageInfo.getTotal());//每页有几条数据
        data.put("total_page",pageInfo.getPages());//总页数
        data.put("current_page",pageInfo.getPageNum());//当前页
        data.put("data",pageInfo.getList());//返回的video数据
        return data;
    }

    /**
     * 根据id查找视频
     * @param videoId 视频的id
     * @return
     */
    @GetMapping("find_by_Id")
    public Object findById(@RequestParam(value = "video_id",required = true) int videoId){
        return videoService.findById(videoId);
    }

}
