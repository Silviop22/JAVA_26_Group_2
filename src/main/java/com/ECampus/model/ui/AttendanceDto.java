package com.ECampus.model.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Builder
public class AttendanceDto {
    private int attendanceId;
    private int attendance;
    private boolean presentStatus;
    private Date today;

    public AttendanceDto(int attendanceId, int attendance, boolean presentStatus, Date today) {
        this.attendanceId = attendanceId;
        this.attendance = attendance;
        this.presentStatus = presentStatus;
        this.today = today;
    }
}
