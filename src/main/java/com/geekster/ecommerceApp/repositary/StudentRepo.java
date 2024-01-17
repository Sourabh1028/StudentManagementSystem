package com.geekster.ecommerceApp.repositary;

import com.geekster.ecommerceApp.modle.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Query
    List<Student> getStudentByCourse(Long id);
}
