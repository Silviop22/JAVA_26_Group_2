package com.ECampus.controller;

import com.ECampus.model.ui.PresenceDto;
import com.ECampus.service.PresenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/presence")
public class PresenceController {

    private final PresenceService presenceService;

    @GetMapping("/{presenceId}")
    public ResponseEntity<PresenceDto> getById(@PathVariable Long presenceId) {
        return ResponseEntity.ok(presenceService.getById(presenceId));
    }
}
