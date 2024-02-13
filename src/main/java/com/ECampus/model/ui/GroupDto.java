package com.ECampus.model.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GroupDto {
    private Long groupId;
    private int groupCapacity;

    public GroupDto(Long groupId, int groupCapacity) {
        this.groupId = groupId;
        this.groupCapacity = groupCapacity;
    }
    
}
