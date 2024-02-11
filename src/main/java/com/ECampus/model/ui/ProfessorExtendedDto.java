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
    }
}
