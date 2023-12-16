package com.springFramework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Shape implements BeanNameAware, ApplicationContextAware {

    private Triangle triangle;
    ApplicationContext applicationContext = null;
    String beanName = null;

    public Shape(){

    }

    public Shape(Triangle triangle){
        this.triangle=triangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName=beanName;
        System.out.println(beanName+ " class Shape->setBeanName() method called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(beanName+" class Shape->setApplicationContext() method called");
        this.applicationContext = applicationContext;
    }
}
