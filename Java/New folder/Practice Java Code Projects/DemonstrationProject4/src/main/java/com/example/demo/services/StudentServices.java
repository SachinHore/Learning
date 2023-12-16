package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServices {
    @Autowired
    private StudentDAO studentDAO;

    public StudentServices(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    public List<Student> getStudents() {
        return studentDAO.findAll();
    }



    public Student getStudent(int id)  {
            return studentDAO.findById(id);/*.orElseThrow(() ->
                    new ResourceNotFoundException("Student object not found"));*/
    }


    public void createStudent(Student student) {
        studentDAO.save(student);
    }

    public void updateStudent(Student student) {
        getStudent(student.getId());
        studentDAO.update(student);

    }

    public void deleteStudent(int id) {
        getStudent(id);
        studentDAO.deleteById(id);
    }
/*

    public List<Student> getStudentByAny(String any) {
        try {
            int i = Integer.parseInt(any);
            return getStudents().stream().filter(e -> (e.getId() == i)||(e.getPhone() == i)).collect(Collectors.toList());
        }catch (Exception e){
            return getStudents().stream().filter(a -> any.equals(a.getName())).collect(Collectors.toList());
        }

    }*/


}
