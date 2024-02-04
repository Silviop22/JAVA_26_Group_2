package com.ECampus.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

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
    @OneToMany(mappedBy = "courseId")
    private Set<Course> courses;



}
