package com.ECampus.model.ui;

import com.ECampus.model.Calendar;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Builder
public class CourseDto {
    private Long courseId;
    private String courseName;
    private float courseECTS;
    private Set<com.ECampus.model.Calendar> calendar;

    public CourseDto(Long courseId, String courseName, float courseECTS, Set<Calendar> calendar) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseECTS = courseECTS;
        this.calendar= calendar;
    }
}
