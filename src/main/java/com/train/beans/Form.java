package com.train.beans;

import java.util.HashMap;

public class Form {
    private int id; ///表单唯一标识
    private String department;  //申请部门
    private String user;  //申请人
    private HashMap detail; //明细
    private int detailId;
    private String date; //申请日期

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap getDetail() {
        return detail;
    }

    public void setDetail(HashMap detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", user='" + user + '\'' +
                ", detail=" + detail +
                ", detailId=" + detailId +
                ", date='" + date + '\'' +
                '}';
    }
}
