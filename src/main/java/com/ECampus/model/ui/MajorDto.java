package com.ECampus.model.ui;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MajorDto {
    private Long majorId;
    private int studentQuota;

    public MajorDto(Long majorId, int studentQuota) {
        this.majorId = majorId;
        this.studentQuota = studentQuota;
    }
}
