package com.song.video_pay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 节
 */
public class Episode implements Serializable{
  private Long id;
  private String title;
  private Long num;
  private String duration;
  private String cover_img;
  private Long video_id;
  private String summary;
  private Date create_time;
  private Long chapter_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public String getCover_img() {
    return cover_img;
  }

  public void setCover_img(String cover_img) {
    this.cover_img = cover_img;
  }

  public Long getVideo_id() {
    return video_id;
  }

  public void setVideo_id(Long video_id) {
    this.video_id = video_id;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Long getChapter_id() {
    return chapter_id;
  }

  public void setChapter_id(Long chapter_id) {
    this.chapter_id = chapter_id;
  }
}
