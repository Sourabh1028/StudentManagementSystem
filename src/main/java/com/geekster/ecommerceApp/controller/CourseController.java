package com.geekster.ecommerceApp.controller;

import com.geekster.ecommerceApp.modle.Course;
import com.geekster.ecommerceApp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping(value = "/getAllC")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }


}
