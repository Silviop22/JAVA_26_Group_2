package com.ECampus.controller;


import com.ECampus.model.ui.AttendanceDto;
import com.ECampus.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/attendance")
public class AttendanceController {

    private final AttendanceService attendanceService;

    @GetMapping("/{attendanceId}")
    public ResponseEntity<AttendanceDto> getById(@PathVariable Long attendanceId) {
        return ResponseEntity.ok(attendanceService.getById(attendanceId));
    }

}
