package com.ECampus.model.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LectureHallDto {
    private int hallId;
    private  boolean status;
    private int capacity;
    public LectureHallDto(int hallId, boolean status, int capacity) {
        this.hallId = hallId;
        this.status = status;
        this.capacity = capacity;
    }
}
