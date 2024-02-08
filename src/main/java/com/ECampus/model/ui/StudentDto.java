package com.ECampus.model.ui;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Builder
@Getter
@Setter
public class StudentDto{
    private Long studentId;
    private String studentFirstName;
    private String studentLastName;

    public StudentDto(Long studentId, String studentFirstName, String studentLastName){
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }
}
