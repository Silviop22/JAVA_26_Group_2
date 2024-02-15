package com.ECampus.controller;

import com.ECampus.model.Student;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.getById(id));
    }

    @PostMapping("/{id}/courses")
    public ResponseEntity<String> addCalendar(@PathVariable Long id, @RequestBody CalendarDto calendarDto) {
        return ResponseEntity.ok(courseService.addCalendar(id, calendarDto));
    }

//    @PostMapping
//    public ResponseEntity<Object> createCourse(@Validated @RequestBody CourseDto courseDto) {
//        CourseDto result = courseService.createCourse(courseDto);
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{courseId}")
//                .buildAndExpand(result.getCourseId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }
}
