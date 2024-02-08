package com.ECampus.controller;

import com.ECampus.model.Student;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{studentId}")
    public ResponseEntity<StudentDto> getById(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentService.getById(studentId));
    }

    @GetMapping
    public ResponseEntity<Set<StudentDto>> getList() {
        return ResponseEntity.ok(studentService.getList());
    }

    @PostMapping
    public ResponseEntity<Object> createStudent(@Validated @RequestBody StudentExtendedDto student) {
        Student result = studentService.createStudent(student);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{studentId}")
                .buildAndExpand(result.getStudentId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Object> deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();

    }
}
