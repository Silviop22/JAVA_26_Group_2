package com.ECampus.service.shared;

import com.ECampus.model.Professor;
import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.model.ui.ProfessorExtendedDto;

public class ProfessorMapper implements Mapper<ProfessorDto, ProfessorExtendedDto, Professor> {

    @Override
    public ProfessorDto toDto(Professor entity) {
        return ProfessorDto.builder()
                .professorId(entity.getProfessorId())
                .professorFirstName(entity.getProfessorFirstName())
                .professorLastName(entity.getProfessorLastName())
                .build();
    }

    public ProfessorExtendedDto toExtendedDto(Professor entity) {
        return ProfessorExtendedDto.builder()
                .professorId(entity.getProfessorId())
                .professorFirstName(entity.getProfessorFirstName())
                .professorLastName(entity.getProfessorLastName())
                .professorBirthDate(entity.getProfessorBirthDate())
                .professorEmail(entity.getProfessorEmail())
                .professorAddress(entity.getProfessorAddress())
                .build();
    }

    public Professor toEntity(ProfessorExtendedDto dto) {
        return new Professor().builder()
                .professorId(dto.getProfessorId())
                .professorFirstName(dto.getProfessorFirstName())
                .professorLastName(dto.getProfessorLastName())
                .professorBirthDate(dto.getProfessorBirthDate())
                .professorEmail(dto.getProfessorEmail())
                .professorAddress(dto.getProfessorAddress())
                .build();
    }
}
