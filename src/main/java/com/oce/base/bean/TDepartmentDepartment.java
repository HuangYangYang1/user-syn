package com.oce.base.bean;


import java.sql.Timestamp;

public class TDepartmentDepartment {

  private long id;
  private long chile_department_id;
  private long father_department_id;
  private long is_sub;
  private Timestamp create_time;
  private Timestamp update_time;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getChile_dpartment_id() {
    return chile_department_id;
  }

  public void setChile_dpartment_id(long chile_dpartment_id) {
    this.chile_department_id = chile_dpartment_id;
  }

  public long getFather_departmet_id() {
    return father_department_id;
  }

  public void setFather_departmet_id(long father_departmet_id) {
    this.father_department_id = father_departmet_id;
  }

  public long getIs_sub() {
    return is_sub;
  }

  public void setIs_sub(long is_sub) {
    this.is_sub = is_sub;
  }

  public Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Timestamp create_time) {
    this.create_time = create_time;
  }

  public Timestamp getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Timestamp update_time) {
    this.update_time = update_time;
  }
}
