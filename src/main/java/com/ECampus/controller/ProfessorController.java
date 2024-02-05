package com.ECampus.controller;

import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping("/{professorId}")
    public ResponseEntity<ProfessorDto> getById(@PathVariable Long professorId) {
        return ResponseEntity.ok(professorService.getById(professorId));
    }
}
