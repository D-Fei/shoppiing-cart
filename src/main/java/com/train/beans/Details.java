package com.train.beans;

public class Details {
    private int id;
    private int detailId;
    private String name;
    private String spec; //规格
    private int num; //数量

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", detailId=" + detailId +
                ", name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                ", num=" + num +
                '}';
    }
}
