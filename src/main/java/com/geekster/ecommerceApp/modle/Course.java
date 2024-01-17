package com.geekster.ecommerceApp.modle;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CourseTable")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long CourseId;
    public String CourseName;
    public Integer CourseDurationInMonths;
    @Enumerated(value = EnumType.STRING)
    public Gender CourseType;
    public String CourseFee;

    public LocalDate studentDOB;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_studentId")
    public Student student;

}