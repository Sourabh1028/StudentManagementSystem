package com.geekster.ecommerceApp.service;

import com.geekster.ecommerceApp.modle.Student;
import com.geekster.ecommerceApp.repositary.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getStudentByCourse(Long id) {
        return studentRepo.getStudentByCourse(id);
    }
}
