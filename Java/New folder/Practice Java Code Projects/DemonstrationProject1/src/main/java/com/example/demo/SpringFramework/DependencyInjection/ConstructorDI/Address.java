package com.example.demo.SpringFramework.DependencyInjection.ConstructorDI;

public class Address {
    String city;
    String state;
    String pincode;

    public Address(String city,String state,String pincode)
    {
        this.city=city;
        this.state=state;
        this.pincode=pincode;
    }

    public String toString(){
        return city+" "+state+" "+pincode;
    }

}
