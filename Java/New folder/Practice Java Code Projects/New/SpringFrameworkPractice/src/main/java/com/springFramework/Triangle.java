package com.springFramework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements BeanNameAware, ApplicationContextAware {
    private String type;
    private int height;
    ApplicationContext applicationContext = null;
    String beanName = null;

    public Triangle (){}

    public Triangle(String type){
        this.type=type;
    }
    public Triangle(int height){
        this.height=height;
    }
    public Triangle(String type,int height){
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
    public void setBeanName(String beanName) {
        this.beanName=beanName;
        System.out.println(beanName+ " class Triangle->setBeanName() method called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(beanName+" class Triangle->setApplicationContext() method called");
        this.applicationContext = applicationContext;
    }
}
