package com.example.demo.SpringFramework.DependencyInjection.SetterDI;

public class Address {
    String city;
    String state;
    String pincode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String toString(){
        return city+" "+state+" "+pincode;
    }

}
