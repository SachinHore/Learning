package com.springFramework;

public class Triangle5 {
    private String type;
    private int height;

    public Triangle5(){}

    public Triangle5(String type){
        this.type=type;
    }
    public Triangle5(int height){
        this.height=height;
    }
    public Triangle5(String type, int height){
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
