package com.demonstration.model;

public class BankEmployee extends Person {
    private String employeeId;
    private String password;
    private float salary;
    public String designation;

    public BankEmployee(){

    }

    public BankEmployee(String name, int age, String gender,String employeeId, String password, float salary, String designation) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.password = password;
        this.salary = salary;
        this.designation = designation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
