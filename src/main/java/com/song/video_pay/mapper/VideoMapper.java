package com.song.video_pay.mapper;

import com.song.video_pay.domain.Video;
import com.song.video_pay.provider.VideoProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface VideoMapper {

    @Select("SELECT * FROM video")
    List<Video> getAll();

    @Select("SELECT * FROM video WHERE id=#{id}")
    Video findById(int id);

//    @Update("UPDATE video SET title=#{title} WHERE id=#{id}")
    @UpdateProvider(type = VideoProvider.class,method = "updateVideo")
    int update(Video video);

    @Delete("DELETE FROM video where id=#{id}")
    int delete(int id);

    @Insert("INSERT INTO video(title,summary,cover_img,view_num,price,create_time,online,point) VALUES(#{title},#{summary},#{cover_img},#{view_num},#{price},#{create_time},#{online},#{point})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int save(Video video);
}
