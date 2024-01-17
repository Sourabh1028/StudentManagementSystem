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
@Table(name = "StudentTable")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StudentId;
    private String StudentName;
    private Integer StudentAge;
    @Enumerated(value = EnumType.STRING)
    private Gender StudentGender;

    private LocalDate studentDOB;

}
