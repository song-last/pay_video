package com.song.video_pay.provider;

import com.song.video_pay.domain.Video;
import org.apache.ibatis.jdbc.SQL;

public class VideoProvider {

    /**
     * 更新sql
     * @param video
     * @return
     */
    public String updateVideo(final Video video){
        return new SQL(){{
            UPDATE("video");
            //条件写法.
            if(video.getTitle()!= null){
                SET("title=#{title}");
            }
            if(video.getSummary()!=null){
                SET("summary=#{summary}");
            }
            if(video.getCover_img()!=null){
                SET("cover_img=#{cover_img}");
            }
            if(video.getView_num()!=null){
                SET("view_num=#{view_num}");
            }
            if(video.getPrice()!=null){
                SET("price=#{price}");
            }
            if(video.getCreate_time()!=null){
                SET("create_time=#{create_time}");
            }
            if(video.getOnline()!=null){
                SET("online=#{online}");
            }
            if(video.getPoint()!=null){
                SET("point=#{point}");
            }
            WHERE("id=#{id}");
        }}.toString();
    }
}
