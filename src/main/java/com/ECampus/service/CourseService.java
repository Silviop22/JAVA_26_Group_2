package com.ECampus.service;

import com.ECampus.model.Course;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.repository.CourseRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseDto getById(Long id){
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found"));
        return new CourseDto(course.getCourseId(), course.getCourseName(), course.getCourseECTS());
    }
}

