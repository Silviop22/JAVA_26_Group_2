package com.ECampus.model.ui;


import java.time.LocalDateTime;
public class CalendarDto {
    private Long calendarId;
    private LocalDateTime timeSlot;


    public CalendarDto(Long calendarId, LocalDateTime timeSlot) {
        this.calendarId = calendarId;
        this.timeSlot = timeSlot;
    }
}
