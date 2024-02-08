package com.ECampus.service.shared;

import com.ECampus.model.Student;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;

public class StudentMapper implements Mapper<StudentDto, StudentExtendedDto, Student> {

    @Override
    public StudentDto toDto(Student entity) {
        return StudentDto.builder()
                .studentId(entity.getStudentId())
                .studentFirstName(entity.getStudentFirstName())
                .studentLastName(entity.getStudentLastName())
                .build();
    }

    public StudentExtendedDto toExtendedDto(Student entity) {
        return StudentExtendedDto.builder()
                .studentId(entity.getStudentId())
                .studentFirstName(entity.getStudentFirstName())
                .studentLastName(entity.getStudentLastName())
                .birthDate(entity.getBirthDate())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .build();
    }

    public Student toEntity(StudentExtendedDto dto) {
        return new Student().builder()
                .studentId(dto.getStudentId())
                .studentFirstName(dto.getStudentFirstName())
                .studentLastName(dto.getStudentLastName())
                .birthDate(dto.getBirthDate())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
    }

}
