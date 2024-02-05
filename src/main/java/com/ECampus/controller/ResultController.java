package com.ECampus.controller;

import com.ECampus.model.ui.ResultDto;
import com.ECampus.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/result")
public class ResultController {

    private final ResultService resultService;

    @GetMapping("/{resultId}")
    public ResponseEntity<ResultDto> getById(@PathVariable Long resultId) {
        return ResponseEntity.ok(resultService.getById(resultId));
    }

}
