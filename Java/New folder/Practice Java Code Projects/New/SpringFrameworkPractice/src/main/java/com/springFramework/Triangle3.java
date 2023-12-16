package com.springFramework;

import org.springframework.beans.factory.annotation.Required;

public class Triangle3 {
    private String type;
    private int height;

    public Triangle3(){}

    public Triangle3(String type){
        this.type=type;
    }
    public Triangle3(int height){
        this.height=height;
    }
    public Triangle3(String type, int height){
        this.type=type;
        this.height=height;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void draw(){
        System.out.println(getType()+" Triangle drawn of height "+getHeight());
    }

}
