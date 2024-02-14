package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Course;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.service.shared.Mapper;

public class CourseMapper implements Mapper<CourseDto, Course> {

    public CourseDto toDto(Course entity){
        return CourseDto.builder()
                .courseId(entity.getCourseId())
                .courseName(entity.getCourseName())
                .courseECTS(entity.getCourseECTS())
                .build();
    }
}
