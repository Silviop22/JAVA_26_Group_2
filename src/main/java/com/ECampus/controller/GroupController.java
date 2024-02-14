package com.ECampus.controller;

import com.ECampus.model.Group;
import com.ECampus.model.Professor;
import com.ECampus.model.ui.GroupDto;
import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.model.ui.ProfessorExtendedDto;
import com.ECampus.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;

    @GetMapping("/{groupId}")
    public ResponseEntity<GroupDto> getById(@PathVariable Long groupId) {
        return ResponseEntity.ok(groupService.getById(groupId));
    }
    @GetMapping("/{groupId}")
    public ResponseEntity<Set<GroupDto>> getList() {

        return ResponseEntity.ok(groupService.getList());
    }
//    @PostMapping
//    public ResponseEntity<Object> createNewGroup(@Validated @RequestBody Group group) {
//        Group result = groupService.createNewGroup(group);
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{groupId}")
//                .buildAndExpand(group.getGroupId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }
    @DeleteMapping("/{groupId}")
    public ResponseEntity<Object> deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return ResponseEntity.noContent().build();

    }

}
