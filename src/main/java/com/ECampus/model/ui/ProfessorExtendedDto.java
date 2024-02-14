package com.ECampus.model.ui;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
public class ProfessorExtendedDto {

<<<<<<< Updated upstream
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String address;

    public ProfessorExtendedDto(Long id, String firstName, String lastName, Date birthDate, String email, String address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
=======
    private Long professorId;
    private String professorFirstName;
    private String professorLastName;
    private Date professorBirthDate;
    private String professorEmail;
    private String professorAddress;
    private List<Long> classes;

    public ProfessorExtendedDto(Long professorId, String professorFirstName, String professorLastName,
                                Date professorBirthDate, String professorEmail, String professorAddress, List<Long> classes){
        this.professorId = professorId;
        this.professorFirstName = professorFirstName;
        this.professorLastName = professorLastName;
        this.professorBirthDate = professorBirthDate;
        this.professorEmail = professorEmail;
        this.professorAddress = professorAddress;
        this.classes = classes;
>>>>>>> Stashed changes
    }
}
