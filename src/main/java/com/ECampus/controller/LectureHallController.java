package com.ECampus.controller;

import com.ECampus.model.ui.LectureHallDto;
import com.ECampus.service.LectureHallService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lectureHall")
public class LectureHallController {

    private final LectureHallService lectureHallService;

    @GetMapping("/{hallId}")
    public ResponseEntity<LectureHallDto> getById(@PathVariable Long hallId) {
        return ResponseEntity.ok(lectureHallService.getById(hallId));
    }
}
