package com.ECampus.model.ui;

import com.ECampus.model.MajorEnum;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MajorDto {
    private Long majorId;
    private MajorEnum majorName;
    private int studentQuota;

    public MajorDto(Long majorId, MajorEnum majorName, int studentQuota) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.studentQuota = studentQuota;
    }
}
