package com.song.video_pay.controller.admin;

import com.song.video_pay.domain.Video;
import com.song.video_pay.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {

    @Autowired
    private VideoService videoService;

    /**
     * 更新视频
     * @param video video对象
     * @return
     */
    @PutMapping("update")
    public Object update(@RequestBody Video video){
        return videoService.update(video);
    }

    /**
     * 根据id删除视频
     * @param videoId 视频的id
     * @return
     */
    @DeleteMapping("del_by_Id")
    public Object delById(@RequestParam(value = "video_id",required = true) int videoId){
        return videoService.delete(videoId);
    }

    /**
     * 保存视频
     * @param video video对象
     * @return
     */
    @PostMapping("save")
    public Object save(@RequestBody Video video){
        return videoService.save(video);
    }

}
