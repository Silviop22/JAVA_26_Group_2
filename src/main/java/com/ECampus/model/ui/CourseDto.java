package com.ECampus.model.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CourseDto {
    private Long courseId;
    private String courseName;
    private float courseECTS;
    private Long calendarId;

    public CourseDto(Long courseId, String courseName, float courseECTS, Long calendarId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseECTS = courseECTS;
        this.calendarId= calendarId;
    }
}
