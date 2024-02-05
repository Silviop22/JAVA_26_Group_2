package com.ECampus.model.ui;


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
