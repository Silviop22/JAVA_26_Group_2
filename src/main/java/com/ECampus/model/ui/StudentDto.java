package com.ECampus.model.ui;


import java.util.Date;

public class StudentDto{
    private Long studentId;
    private String studentFirstName;
    private String studentLastName;
    private Date birthDate;
    private String email;
    private String address;

    public StudentDto(Long studentId, String studentFirstName, String studentLastName, Date birthDate, String email, String address){
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
    }
}
