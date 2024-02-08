package com.ECampus.controller;

import com.ECampus.model.ui.GroupDto;
import com.ECampus.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;

    @GetMapping("/{groupId}")
    public ResponseEntity<GroupDto> getById(@PathVariable Long groupId) {
        return ResponseEntity.ok(groupService.getById(groupId));
    }


}
