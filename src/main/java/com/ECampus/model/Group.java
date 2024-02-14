package com.ECampus.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="group_nr")
@Builder
@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;
    private int groupCapacity;
    @OneToMany(mappedBy = "studentId")
    private Set<Student> students;

    @OneToMany(mappedBy = "calendarId")
    private Set<Calendar> calendars;



}
