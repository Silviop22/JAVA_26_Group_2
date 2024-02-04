package com.ECampus.controller;

import com.ECampus.model.ui.MajorDto;
import com.ECampus.service.MajorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/major")
public class MajorController {

    private final MajorService majorService;

    @GetMapping("/{majorId}")
    public ResponseEntity<MajorDto> getById(@PathVariable Long majorId) {
        return ResponseEntity.ok(majorService.getById(majorId));
    }


}
