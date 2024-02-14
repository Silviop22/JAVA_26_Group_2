package com.ECampus.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="majors")
@Builder
@Entity
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long majorId;
    private MajorEnum majorName;
    private int studentQuota;
    @OneToMany(mappedBy = "courseId")
    private Set<Course> courses;
    @OneToMany(mappedBy = "studentId")
    private Set<Student> students;

}
