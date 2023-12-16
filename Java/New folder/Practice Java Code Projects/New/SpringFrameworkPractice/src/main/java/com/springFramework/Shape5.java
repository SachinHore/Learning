package com.springFramework;


import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;


public class Shape5 {


    private Triangle5 triangle;

    public Shape5(){

    }

    public Shape5(Triangle5 triangle){
        this.triangle=triangle;
    }

    public Triangle5 getTriangle() {
        return triangle;
    }

    //@Autowired
    //@Qualifier("abc")
    @Resource()
    public void setTriangle(Triangle5 triangle) {
        this.triangle = triangle;
    }

    @PostConstruct
    public void initializeTriangle(){
        System.out.println("Init of triangle");
    }

    @PreDestroy
    public void destroyTriangle(){
        System.out.println("Destroy of triangle");
    }


}
