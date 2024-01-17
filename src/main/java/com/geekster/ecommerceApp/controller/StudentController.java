package com.geekster.ecommerceApp.controller;

import com.geekster.ecommerceApp.modle.Student;
import com.geekster.ecommerceApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "course/{id}")
    public List<Student> getStudentByCourse(Long id){
        return studentService.getStudentByCourse(id);
    }

}
