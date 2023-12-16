package com.springFramework;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Triangle2 {
    private String type;
    private int height;

    public Triangle2(){}

    public Triangle2(String type){
        this.type=type;
    }
    public Triangle2(int height){
        this.height=height;
    }
    public Triangle2(String type, int height){
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
