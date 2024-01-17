package com.geekster.ecommerceApp.controller;

import com.geekster.ecommerceApp.modle.Student;
import com.geekster.ecommerceApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getStudent")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("Student added successfully...!", HttpStatus.OK);

    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        String result = studentService.updateStudent(id, student);
        if (result.equals("Student updated successfully...!")) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student Deleted successfully...!", HttpStatus.NO_CONTENT);
    }

}
