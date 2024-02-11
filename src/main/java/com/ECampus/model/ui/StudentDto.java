package com.ECampus.model.ui;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Builder
@Getter
@Setter
public class StudentDto{
    private Long id;
    private String firstName;
    private String lastName;

    public StudentDto(Long id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
