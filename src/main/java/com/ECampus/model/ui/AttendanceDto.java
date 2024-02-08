package com.ECampus.model.ui;

import java.util.Date;

public class AttendanceDto {
    private int attendanceId;
    private int attendance;
    private boolean presenceStatus;
    private Date today;

    public AttendanceDto(int attendanceId, int attendance, boolean presenceStatus, Date today) {
        this.attendanceId = attendanceId;
        this.attendance = attendance;
        this.presenceStatus = presenceStatus;
        this.today = today;
    }
}
