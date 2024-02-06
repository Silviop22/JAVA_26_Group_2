package com.ECampus.model.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProfessorDto {
    private Long professorId;
    private String professorFirstName;
    private String professorLastName;

    public ProfessorDto(Long professorId, String professorFirstName, String professorLastName) {
        this.professorId = professorId;
        this.professorFirstName = professorFirstName;
        this.professorLastName = professorLastName;
    }

}
