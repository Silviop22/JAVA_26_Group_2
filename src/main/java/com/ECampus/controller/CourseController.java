package com.ECampus.controller;

import com.ECampus.model.ui.CalendarDto;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
