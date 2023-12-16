package com.springFramework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle1 implements InitializingBean, DisposableBean {
    private String type;
    private int height;

    public Triangle1(){}

    public Triangle1(String type){
        this.type=type;
    }
    public Triangle1(int height){
        this.height=height;
    }
    public Triangle1(String type, int height){
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


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing init method called for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method called for Triangle");
    }

    public void myInit(){
        System.out.println(" myInit method called for Triangle");
    }

    public void cleanup(){
        System.out.println(" cleanup method called for Triangle");
    }
}
