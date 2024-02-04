package com.ECampus.model.ui;

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
