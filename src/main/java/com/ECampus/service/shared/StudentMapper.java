package com.ECampus.service.shared;

import com.ECampus.model.Student;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;

public class StudentMapper implements ExtendedMapper<StudentDto, StudentExtendedDto, Student> {

    @Override
    public StudentDto toDto(Student entity) {
        return StudentDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }

    @Override
    public StudentExtendedDto toExtendedDto(Student entity) {
        return StudentExtendedDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .birthDate(entity.getBirthDate())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .build();
    }

    @Override
    public Student toEntity(StudentExtendedDto dto) {
        return new Student().builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .birthDate(dto.getBirthDate())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
    }

}
