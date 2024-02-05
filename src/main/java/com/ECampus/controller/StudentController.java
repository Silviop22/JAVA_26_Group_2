package com.ECampus.controller;

import com.ECampus.model.ui.StudentDto;
import com.ECampus.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentDto> getById(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentService.getById(studentId));
    }
}
