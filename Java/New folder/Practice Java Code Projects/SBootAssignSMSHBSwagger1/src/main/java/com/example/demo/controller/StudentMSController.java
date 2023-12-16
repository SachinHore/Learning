package com.example.demo.controller;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@ApiOperation(value = "students", tags = "Student MS controller")
@RestController
@RequestMapping("/students")
public class StudentMSController {

    private StudentServices studentServices;

    public StudentMSController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @ApiOperation(value = "Fetch all Students record", response = Iterable.class)
    @GetMapping()
    public List<Student> getStudents(){

        return this.studentServices.getStudents();
    }


    @ApiOperation(value = "Fetch Students record by ID", response = Student.class)
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return this.studentServices.getStudent(id);

    }

    @ApiOperation(value = "Insert Student record", response = Student.class)
    @PostMapping()
    public String createStudent(@RequestBody Student student){
        this.studentServices.createStudent(student);
        return "Created "+student.getId();
    }

    @ApiOperation(value = "Update Students record", response = Student.class)
    @PutMapping()
    public String updateStudent(@RequestBody Student student){
        this.studentServices.updateStudent(student);
        return "Updated "+student.getId();
    }

    @ApiOperation(value = "Delete Student record", response = Student.class)
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        this.studentServices.deleteStudent(id);
        return "Deleted "+id;
    }
}
