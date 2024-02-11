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
    private Long id;
    @Column(unique = true, nullable = false)
    private String firstName;
    @Column(unique = true, nullable = false)
    private String lastName;
    private Date birthDate;
    private String email;
    private String address;
    @OneToMany(mappedBy = "courseId")
    private Set<Course> courses;



}
