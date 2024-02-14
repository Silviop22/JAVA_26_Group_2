package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Major;
import com.ECampus.model.ui.MajorDto;
import com.ECampus.service.shared.Mapper;

public class MajorMapper implements Mapper<MajorDto, Major> {

    public MajorDto toDto(Major entity) {
        return MajorDto.builder()
                .majorId(entity.getMajorId())
                .majorName(entity.getMajorName())
                .studentQuota(entity.getStudentQuota())
                .build();
    }
}
