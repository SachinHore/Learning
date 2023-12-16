package com.example.demo.SpringFramework.BeanConfigTypes.AnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    int id;
    String name;

    @Autowired
    Address address;

    public void setEmployee(int id, String name,String city, String state, String pinCode )
    {
        this.id=id;
        this.name=name;
        address.setAddress(city,state,pinCode);
    }

    void showDetails()
    {
        System.out.println(id+" "+name);
        System.out.println(address.toString());
    }

}
