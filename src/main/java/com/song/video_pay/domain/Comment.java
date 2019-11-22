package com.song.video_pay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
public class Comment implements Serializable{
  private Long id;
  private String content;
  private Long user_id;
  private String head_img;
  private String name;
  private Double point;
  private Long up;
  private Date create_time;
  private Long order_id;
  private Long video_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public String getHead_img() {
    return head_img;
  }

  public void setHead_img(String head_img) {
    this.head_img = head_img;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }

  public Long getUp() {
    return up;
  }

  public void setUp(Long up) {
    this.up = up;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Long getOrder_id() {
    return order_id;
  }

  public void setOrder_id(Long order_id) {
    this.order_id = order_id;
  }

  public Long getVideo_id() {
    return video_id;
  }

  public void setVideo_id(Long video_id) {
    this.video_id = video_id;
  }
}
