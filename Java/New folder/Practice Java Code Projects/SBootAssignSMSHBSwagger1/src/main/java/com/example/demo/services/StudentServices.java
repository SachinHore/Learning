package com.example.demo.services;

import com.example.demo.entities.Student;


import java.util.List;


public interface StudentServices {

    public List<Student> getStudents();

    public Student getStudent(int id);

    public void createStudent(Student student);

    public void updateStudent(Student student);

    public void deleteStudent(int id);
}
