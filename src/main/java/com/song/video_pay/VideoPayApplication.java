package com.song.video_pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.song.video_pay.mapper")
public class VideoPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoPayApplication.class, args);
	}

}
