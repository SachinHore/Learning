package com.example.demo.SpringFramework.DependencyInjection.ConstructorDI;



public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }

    void showDetails()
    {
        System.out.println(id+" "+name);
        System.out.println(address.toString());
    }
}
