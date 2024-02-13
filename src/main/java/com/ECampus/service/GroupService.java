package com.ECampus.service;

import com.ECampus.model.Calendar;
import com.ECampus.model.Course;
import com.ECampus.model.Group;
import com.ECampus.model.Student;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.model.ui.GroupDto;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.repository.GroupRepository;
import com.ECampus.service.shared.Mapper;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupDto getById(Long id) {
        Group group = groupRepository.findById(id)
                 .orElseThrow(() -> new EntityNotFoundException("Group not found."));
                 return new GroupDto(group.getGroupId(), group.getGroupCapacity());

    }
    private Group findExistingGroup(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Group with id " + id + " not found"));
    }

//    public Set<GroupDto> getList() {
//        return groupRepository.findAll()
//                .stream()
//                .map(groupMapper::toDto)
//                .collect(Collectors.toSet());
//    }

    public String addCalendar(Long id, CalendarDto calendarDto) {
        Group group = findExistingGroup(id);
        Calendar calendar = Calendar.builder()
                .timeSlot(calendarDto.timeslot())
                .group(group)
                .build();
        group.getCalendars().add(calendar);
        groupRepository.save(group);
        return "Calendar added successfully";
    }
  public GroupService createNewGroup(Group group) {
      Optional<Group> existingGroup = groupRepository.findByGroupIdAndGroupCapacity
              (group.getGroupId(), group.getGroupCapacity());
      if (existingGroup.isPresent()) {
          throw new EntityExistsException("Group with id " + group.getGroupId() + " and group capacity\n " +
                  group.getGroupCapacity() + " already exists.");
      }
//      else {
//          groupRepository.save(group);
//          return ResponseEntity.ok("Group created succefully.");
//
//      }
      return null;
  }
    public void deleteGroup(Long id) {
        Group group = findExistingGroup(id);
        groupRepository.delete(group);
    }




}

