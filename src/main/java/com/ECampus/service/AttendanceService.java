package com.ECampus.service;

import com.ECampus.model.Attendance;
import com.ECampus.model.ui.AttendanceDto;
import com.ECampus.repository.AttendanceRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceDto getById(Long id){
        Attendance attendance = attendanceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Presence not found."));
        return new AttendanceDto(attendance.getAttendanceId(), attendance.getAttendance(),
                attendance.isPresentStatus(), attendance.getToday());
    }
}
