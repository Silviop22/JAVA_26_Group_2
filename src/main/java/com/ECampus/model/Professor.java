package com.ECampus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="professors")
@Builder
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long professorId;
    @Column(unique = true, nullable = false)
    private String professorFirstName;
    @Column(unique = true, nullable = false)
    private String professorLastName;
    private Date professorBirthDate;
    private String professorEmail;
    private String professorAddress;
    @Column(name="classes")
    private Course course;


}
