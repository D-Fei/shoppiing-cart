package com.train.beans;

public class Goods {
    private String name;
    private String spec; //规格
    private int num; //数量

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
        return "Goods{" +
                "name='" + name + '\'' +
                ", spec='" + spec + '\'' +
                ", num=" + num +
                '}';
    }
}
