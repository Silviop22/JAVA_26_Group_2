package com.ECampus.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.Set;

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
    @ManyToOne
    @JoinColumn(name = "major_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Major major;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    @OneToMany(mappedBy = "attendanceId")
    private Set<Attendance> attendances;
    @OneToMany(mappedBy = "resultsId")
    private Set<Result> results;





}
