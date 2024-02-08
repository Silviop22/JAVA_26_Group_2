package com.ECampus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="courses")
@Builder
@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private float courseECTS;
    @ManyToOne
    @JoinColumn(name = "major_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Major major;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Professor professor;
    @OneToMany(mappedBy = "calendarId")
    private Set<Calendar> calendars;
}
