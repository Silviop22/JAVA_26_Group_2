package com.ECampus.controller;

import com.ECampus.model.Professor;
import com.ECampus.model.Student;
import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.model.ui.ProfessorExtendedDto;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping("/{professorId}")
    public ResponseEntity<ProfessorDto> getById(@PathVariable Long professorId) {
        return ResponseEntity.ok(professorService.getById(professorId));
    }

    @GetMapping
    public ResponseEntity<Set<ProfessorDto>> getList() {
        return ResponseEntity.ok(professorService.getList());
    }

    @PostMapping
    public ResponseEntity<Object> createProfessor(@Validated @RequestBody ProfessorExtendedDto professor) {
        Professor result = professorService.createProfessor(professor);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{professorId}")
                .buildAndExpand(result.getProfessorId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{professorId}")
    public ResponseEntity<Object> deleteProfessor(@PathVariable Long id) {

        professorService.deleteProfessor(id);
        return ResponseEntity.noContent().build();

    }
}
