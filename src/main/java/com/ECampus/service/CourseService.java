package com.ECampus.service;

import com.ECampus.model.Calendar;
import com.ECampus.model.Course;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.repository.CourseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseDto getById(Long id){
        Course course = findById(id);
        return new CourseDto(course.getCourseId(), course.getCourseName(), course.getCourseECTS());
    }

    public Course findById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found"));
    }

    public String addCalendar(Long id, CalendarDto calendarDto) {
        Course course = findById(id);
        Calendar calendar = Calendar.builder()
                .timeSlot(calendarDto.timeslot())
                .course(course)
                .build();
        course.getCalendars().add(calendar);
        courseRepository.save(course);
        return "Calendar added successfully";
    }

}

