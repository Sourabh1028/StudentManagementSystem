package com.geekster.ecommerceApp.modle;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "StudentTable")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;

    @NotBlank
    public String firstName;

    @NotBlank
    public String lastName;

    @Email
    public String email;

    @NonNull
    public Integer rollNo;

}
