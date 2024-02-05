package com.ECampus.service;

import com.ECampus.model.Student;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentDto getById(Long id) {
       Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found."));
        return new StudentDto(student.getStudentId(),
                student.getStudentFirstName(),
                student.getStudentLastName(),
                student.getBirthDate(),
                student.getEmail(),
                student.getAddress());
    }
}
