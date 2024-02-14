package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Attendance;

import com.ECampus.model.ui.AttendanceDto;
import com.ECampus.service.shared.Mapper;


public class AttendanceMapper implements Mapper<AttendanceDto, Attendance> {

    @Override
    public AttendanceDto toDto(Attendance entity) {
        return AttendanceDto.builder()
                .attendanceId(entity.getAttendanceId())
                .attendance(entity.getAttendance())
                .presentStatus(entity.isPresentStatus())
                .today(entity.getToday())
                .build();
    }
}
