package com.oce.base.bean;


import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 岗位实体
 */

public class TPost {

  /**
   *  岗位id
   */
  private long id;
  /**
   *  简称
   */
  private String short_name;
  /**
   *  全称
   */
  private String full_name;
  /**
   *  备注
   */
  private String remark;
  /**
   *  表创建日期
   */
  private Date create_time;
  /**
   *  表更新日期
   */
  private Date update_time;

  @Override
  public String toString() {
    return "TPost{" +
            "id=" + id +
            ", short_name='" + short_name + '\'' +
            ", full_name='" + full_name + '\'' +
            ", remark='" + remark + '\'' +
            ", create_time=" + create_time +
            ", update_time=" + update_time +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getShort_name() {
    return short_name;
  }

  public void setShort_name(String short_name) {
    this.short_name = short_name;
  }

  public String getFull_name() {
    return full_name;
  }

  public void setFull_name(String full_name) {
    this.full_name = full_name;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Date getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Date update_time) {
    this.update_time = update_time;
  }
}
