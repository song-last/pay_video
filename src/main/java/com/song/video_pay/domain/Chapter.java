package com.song.video_pay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 章
 */
public class Chapter implements Serializable{
  private Long id;
  private Long video_id;
  private String title;
  private Long ordered;
  private java.util.Date create_time;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getVideo_id() {
    return video_id;
  }

  public void setVideo_id(Long video_id) {
    this.video_id = video_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getOrdered() {
    return ordered;
  }

  public void setOrdered(Long ordered) {
    this.ordered = ordered;
  }

  public java.util.Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }
}
