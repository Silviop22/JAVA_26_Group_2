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

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String address;
    private Long groupId;
    private Long majorId;

    public StudentExtendedDto(Long id, String firstName, String lastName, Date birthDate,
                              String email, String address, Long groupId, Long majorId){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.groupId = groupId;
        this.majorId = majorId;
    }
}
