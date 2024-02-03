package com.ECampus.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(unique = true, nullable = false)
    private String studentFirstName;
    @Column(unique = true, nullable = false)
    private String studentLastName;
    private Date birthDate;
    private String email;
    private String address;




}
