package com.song.video_pay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 视频
 */
public class Video implements Serializable{
  private Long id;
  private String title;
  private String summary;
  private String cover_img;
  private Long view_num;
  private Long price;
  private Date create_time;
  private Long online;
  private Double point;

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

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getCover_img() {
    return cover_img;
  }

  public void setCover_img(String cover_img) {
    this.cover_img = cover_img;
  }

  public Long getView_num() {
    return view_num;
  }

  public void setView_num(Long view_num) {
    this.view_num = view_num;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Long getOnline() {
    return online;
  }

  public void setOnline(Long online) {
    this.online = online;
  }

  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }
}
