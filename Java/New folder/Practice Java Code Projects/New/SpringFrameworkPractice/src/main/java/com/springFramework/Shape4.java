package com.springFramework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

public class Shape4 {


    private Triangle4 triangle;

    public Shape4(){

    }

    public Shape4(Triangle4 triangle){
        this.triangle=triangle;
    }

    public Triangle4 getTriangle() {
        return triangle;
    }

    @Autowired
    @Qualifier("abc")
    //@Resource(name = "abc")
    public void setTriangle(Triangle4 triangle) {
        this.triangle = triangle;
    }


}
