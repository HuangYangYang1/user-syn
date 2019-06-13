package com.oce.base.bean;


import java.sql.Date;
import java.sql.Timestamp;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门实体
 */

public class TDepartment{
  /**
   *  部门id
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
   *  显示顺序
   */
  private String show_order;
  /**
   *  是否封存 1代表封存
   */
  private String canceled;
  /**
   *  表创建时间
   */
  private Date create_time;
  /**
   *  表更新时间
   */
  private Date update_time;

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

  public String getShow_order() {
    return show_order;
  }

  public void setShow_order(String show_order) {
    this.show_order = show_order;
  }

  public String getCanceled() {
    return canceled;
  }

  public void setCanceled(String canceled) {
    this.canceled = canceled;
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
