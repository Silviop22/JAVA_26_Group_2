package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Professor;
import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.model.ui.ProfessorExtendedDto;
import com.ECampus.service.shared.ExtendedMapper;

public class ProfessorMapper implements ExtendedMapper<ProfessorDto, ProfessorExtendedDto, Professor> {

    @Override
    public ProfessorDto toDto(Professor entity) {
        return ProfessorDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }

    @Override
    public ProfessorExtendedDto toExtendedDto(Professor entity) {
        return ProfessorExtendedDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .birthDate(entity.getBirthDate())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .build();
    }

    @Override
    public Professor toEntity(ProfessorExtendedDto dto) {
        return new Professor().builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .birthDate(dto.getBirthDate())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
    }
}
