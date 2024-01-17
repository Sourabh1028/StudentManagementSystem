package com.geekster.ecommerceApp.service;

import com.geekster.ecommerceApp.modle.Student;
import com.geekster.ecommerceApp.repositary.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;


    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }



    public String updateStudent(Integer id, Student student) {
        Optional<Student> optionalStudent = studentRepo.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setEmail(student.getEmail());
            existingStudent.setRollNo(student.getRollNo());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setFirstName(student.getFirstName());

            // Save the updated student
            studentRepo.save(existingStudent);

            return "Student updated successfully...!";
        } else {
            return "Cannot find the user with id " + id;
        }
    }

    @Transactional
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }
}
