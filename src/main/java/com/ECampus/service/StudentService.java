package com.ECampus.service;

import com.ECampus.model.Student;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.repository.StudentRepository;
import com.ECampus.service.shared.StudentMapper;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;


    private Student findExistingStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student with id " + id + " not found"));
    }
    public StudentDto getById(Long id) {
       Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found."));
        return new StudentDto(student.getId(),
                student.getFirstName(),
                student.getLastName());
    }

    public StudentExtendedDto getStudentById(Long id) {
        Student student = findExistingStudent(id);
        return studentMapper.toExtendedDto(student);
    }

    public Set<StudentDto> getList() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toDto)
                .collect(Collectors.toSet());
    }

    public Student createStudent(StudentExtendedDto student) {
        Optional<Student> existingStudent = studentRepository.findByStudentFirstNameAndStudentLastNameAndEmail
                (student.getFirstName(), student.getLastName(), student.getEmail());
        if (existingStudent.isPresent()) {
            throw new EntityExistsException("Student with name " + student.getFirstName() + " "
                    + student.getLastName()+", with email "
                    + student.getEmail() +" already exists.");
        }
        return studentRepository.save(studentMapper.toEntity(student));
    }

    public void deleteStudent(Long id) {
        Student student = findExistingStudent(id);
        studentRepository.delete(student);
    }

}
