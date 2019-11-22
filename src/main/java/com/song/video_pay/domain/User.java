package com.song.video_pay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 */
public class User implements Serializable{
  private Long id;
  private String openid;
  private String name;
  private String head_img;
  private String phone;
  private String sign;
  private Long sex;
  private String city;
  private Date create_time;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHead_img() {
    return head_img;
  }

  public void setHead_img(String head_img) {
    this.head_img = head_img;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public Long getSex() {
    return sex;
  }

  public void setSex(Long sex) {
    this.sex = sex;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }
}
