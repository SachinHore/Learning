package com.example.demo.SpringFramework.BeanConfigTypes.AnnotationBased;

public class Address {
    String city;
    String state;
    String pinCode;

    public void setAddress(String city, String state, String pinCode )
    {

        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String toString(){
        return city+" "+state+" "+pinCode;
    }
}
