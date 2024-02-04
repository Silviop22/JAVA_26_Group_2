package com.ECampus.model.ui;

public class CourseDto {
    private Long courseId;
    private String courseName;
    private float courseECTS;

    public CourseDto(Long courseId, String courseName, float courseECTS) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseECTS = courseECTS;
    }
}
