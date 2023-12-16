package com.example.demo.entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "StudentMS")
public class Student {

    @Id
    @Column(name="student_id")
    @ApiModelProperty(notes = "ID of Student", name = "student_id", required = true, value = "0000")
    int id;

    @Column(name="student_name",nullable = false)
    @ApiModelProperty(notes = "Name of Student", name = "student_name", required = true, value = "xyz")
    String name;

    @Column(name="student_phone")
    @ApiModelProperty(notes = "Phone of Student", name = "student_phone", required = true, value = "1111")
    int phone;

    public Student(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Student() {

    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

