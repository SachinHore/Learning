package com.springFramework;


import org.springframework.beans.factory.annotation.Required;

public class Shape3 {

    private Triangle3 triangle3;

    public Shape3(){

    }

    public Shape3(Triangle3 triangle3){
        this.triangle3=triangle3;
    }

    public Triangle3 getTriangle3() {
        return triangle3;
    }

    @Required
    public void setTriangle3(Triangle3 triangle3) {
        this.triangle3 = triangle3;
    }


}
