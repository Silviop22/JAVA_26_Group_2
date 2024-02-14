package com.ECampus.model;

import com.ECampus.model.ui.Enrollment;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;
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
    private Long id;
    @Column(unique = true, nullable = false)
    private String firstName;
    @Column(unique = true, nullable = false)
    private String lastName;
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
    @OneToMany(mappedBy = "enrollmentId")
    private Set<Enrollment> enrollments;
    @OneToMany(mappedBy = "resultsId",  cascade = CascadeType.ALL)
    private List<Result> results;





}
