package com.springFramework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class Shape6 {
    private Triangle6 triangle;

    public Shape6(){

    }

    public Shape6(Triangle6 triangle){
        this.triangle=triangle;
    }

    public Triangle6 getTriangle() {
        return triangle;
    }

    @Autowired
    //@Qualifier("abc")
    //@Resource
    public void setTriangle(Triangle6 triangle) {
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
