package com.ECampus.controller;

import com.ECampus.model.Student;
import com.ECampus.model.ui.MajorDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.service.MajorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/major")
public class MajorController {

    private final MajorService majorService;

    @GetMapping("/{majorId}")
    public ResponseEntity<MajorDto> getById(@PathVariable Long majorId) {
        return ResponseEntity.ok(majorService.getById(majorId));
    }

//    @PostMapping
//    public ResponseEntity<Object> createMajor(@Validated @RequestBody MajorDto majorDto) {
//        MajorDto result = majorService.createMajor(majorDto);
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{majorId}")
//                .buildAndExpand(result.getMajorId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }

}
