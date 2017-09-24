package com.dongyang.hospitalapp.domain;


public class Doctor extends Person {

    private String area;
    private String space;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }
}
