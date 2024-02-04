package com.ECampus.service;

import com.ECampus.model.Course;
import com.ECampus.model.Group;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.model.ui.GroupDto;
import com.ECampus.repository.CourseRepository;
import com.ECampus.repository.GroupRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupDto getById(Long id) {
        Group group = GroupRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Group not found"));
        return new GroupDto(group.get)

    }
}

