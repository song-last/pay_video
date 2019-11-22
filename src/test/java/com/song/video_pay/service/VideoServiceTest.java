package com.song.video_pay.service;

import com.song.video_pay.domain.Video;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.StandardSocketOptions;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class VideoServiceTest {

    @Autowired
    private VideoService videoService;


    @Test
    void getAll() {
        List<Video> all = videoService.getAll();
        assertNotNull(all);
        for (Video v : all){
            System.out.println(v.getId());
        }
    }

    @Test
    void findById() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

}