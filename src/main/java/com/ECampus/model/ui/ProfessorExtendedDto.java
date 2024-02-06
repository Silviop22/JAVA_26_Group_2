package com.ECampus.model.ui;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class ProfessorExtendedDto {

    private Long professorId;
    private String professorFirstName;
    private String professorLastName;
    private Date professorBirthDate;
    private String professorEmail;
    private String professorAddress;

    public ProfessorExtendedDto(Long professorId, String professorFirstName, String professorLastName,
                                Date professorBirthDate, String professorEmail, String professorAddress){
        this.professorId = professorId;
        this.professorFirstName = professorFirstName;
        this.professorLastName = professorLastName;
        this.professorBirthDate = professorBirthDate;
        this.professorEmail = professorEmail;
        this.professorAddress = professorAddress;
    }
}
