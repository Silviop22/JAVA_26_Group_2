package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Group;
import com.ECampus.model.ui.GroupDto;
import com.ECampus.service.shared.Mapper;

public class GroupMapper implements Mapper<GroupDto, Group> {
    @Override
    public GroupDto toDto(Group entity) {
        return GroupDto.builder()
                .groupId(entity.getGroupId())
                .groupCapacity(entity.getGroupCapacity())
                .build();
    }
}
