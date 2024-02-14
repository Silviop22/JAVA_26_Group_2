package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Student;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.service.shared.ExtendedMapper;

public class StudentMapper implements ExtendedMapper<StudentDto, StudentExtendedDto, Student> {

    @Override
    public StudentDto toDto(Student entity) {
        return StudentDto.builder()
<<<<<<< Updated upstream:src/main/java/com/ECampus/service/shared/ClassMappers/StudentMapper.java
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
=======
                .studentId(entity.getStudentId())
                .studentFirstName(entity.getFirstName())
                .studentLastName(entity.getLastName())
>>>>>>> Stashed changes:src/main/java/com/ECampus/service/shared/StudentMapper.java
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
                .groupId(entity.getGroup().getGroupId())
                .majorId(entity.getMajor().getMajorId())
                .build();
    }

    @Override
    public Student toEntity(StudentExtendedDto dto) {
        return new Student().builder()
<<<<<<< Updated upstream:src/main/java/com/ECampus/service/shared/ClassMappers/StudentMapper.java
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
=======
                .studentId(dto.getStudentId())
                .firstName(dto.getStudentFirstName())
                .studentLastName(dto.getStudentLastName())
>>>>>>> Stashed changes:src/main/java/com/ECampus/service/shared/StudentMapper.java
                .birthDate(dto.getBirthDate())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
    }

}
