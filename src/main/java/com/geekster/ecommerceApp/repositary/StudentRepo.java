package com.geekster.ecommerceApp.repositary;

import com.geekster.ecommerceApp.modle.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    Optional<Student> findById(Integer id);

    void deleteById(Integer id);
}
