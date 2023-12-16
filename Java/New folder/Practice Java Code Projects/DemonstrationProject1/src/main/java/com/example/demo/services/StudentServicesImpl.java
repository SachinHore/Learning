package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.DAO.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImpl implements StudentServices {
    private StudentDAO studentDAO;

    public StudentServicesImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> getStudents() {

        return studentDAO.findAll();
    }

    @Override
    public Student getStudent(int id) {

        return studentDAO.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Student","Id",id));
    }

    @Override
    public void createStudent(Student student) {
        studentDAO.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        Student oldStudent = studentDAO.findById(student.getId()).orElseThrow(() ->
                new ResourceNotFoundException("Student","Id",student.getId()));
        oldStudent.setId(student.getId());
        oldStudent.setName(student.getName());
        oldStudent.setPhone(student.getPhone());
        studentDAO.save(oldStudent);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Student","Id",id));

        studentDAO.deleteById(id);

    }
}
