package com.ECampus.controller;

import com.ECampus.model.Student;
import com.ECampus.model.ui.LectureHallDto;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.service.LectureHallService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lectureHall")
public class LectureHallController {

    private final LectureHallService lectureHallService;

    @GetMapping("/{hallId}")
    public ResponseEntity<LectureHallDto> getById(@PathVariable Long hallId) {
        return ResponseEntity.ok(lectureHallService.getById(hallId));
    }
//    @PostMapping
//    public ResponseEntity<Object> createNewLectureHall(@Validated @RequestBody LectureHallDto lectureHall) {
//        LectureHallDto result = lectureHallService.createLectureHall(lectureHall);
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{hallId}")
//                .buildAndExpand(result.getHallId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }

}
