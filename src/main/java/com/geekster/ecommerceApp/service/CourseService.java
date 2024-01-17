package com.geekster.ecommerceApp.service;

import com.geekster.ecommerceApp.modle.Course;
import com.geekster.ecommerceApp.repositary.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;


    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }
}
