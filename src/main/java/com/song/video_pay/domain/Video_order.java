package com.song.video_pay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 */
public class Video_order implements Serializable{
  private Long id;
  private String openid;
  private String out_trade_no;
  private Long state;
  private Date create_time;
  private Date notify_time;
  private Long total_fee;
  private String nickname;
  private String head_img;
  private Long video_id;
  private String video_title;
  private String video_img;
  private Long user_id;
  private String ip;
  private Long del;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getOut_trade_no() {
    return out_trade_no;
  }

  public void setOut_trade_no(String out_trade_no) {
    this.out_trade_no = out_trade_no;
  }

  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Date getNotify_time() {
    return notify_time;
  }

  public void setNotify_time(Date notify_time) {
    this.notify_time = notify_time;
  }

  public Long getTotal_fee() {
    return total_fee;
  }

  public void setTotal_fee(Long total_fee) {
    this.total_fee = total_fee;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getHead_img() {
    return head_img;
  }

  public void setHead_img(String head_img) {
    this.head_img = head_img;
  }

  public Long getVideo_id() {
    return video_id;
  }

  public void setVideo_id(Long video_id) {
    this.video_id = video_id;
  }

  public String getVideo_title() {
    return video_title;
  }

  public void setVideo_title(String video_title) {
    this.video_title = video_title;
  }

  public String getVideo_img() {
    return video_img;
  }

  public void setVideo_img(String video_img) {
    this.video_img = video_img;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Long getDel() {
    return del;
  }

  public void setDel(Long del) {
    this.del = del;
  }
}
