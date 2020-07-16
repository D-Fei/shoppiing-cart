package com.train.beans;

public class Department {
    private String name;
    private int departID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartID() {
        return departID;
    }

    public void setDepartID(int departID) {
        this.departID = departID;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departID=" + departID +
                '}';
    }
}
