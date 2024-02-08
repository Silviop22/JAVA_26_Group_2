package com.ECampus.model.ui;

import com.ECampus.model.Attendance;
import com.ECampus.model.Group;
import com.ECampus.model.Major;
import com.ECampus.model.Result;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Builder
public class StudentExtendedDto {

    private Long studentId;
    private String studentFirstName;
    private String studentLastName;
    private Date birthDate;
    private String email;
    private String address;

    public StudentExtendedDto(Long studentId, String studentFirstName, String studentLastName, Date birthDate, String email, String address){
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
    }

}
