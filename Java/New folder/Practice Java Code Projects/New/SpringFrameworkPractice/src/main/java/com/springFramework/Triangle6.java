package com.springFramework;

import org.springframework.stereotype.Component;

@Component
public class Triangle6 {
    private String type;
    private int height;

    public Triangle6(){}

    public Triangle6(String type){
        this.type=type;
    }
    public Triangle6(int height){
        this.height=height;
    }
    public Triangle6(String type, int height){
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
