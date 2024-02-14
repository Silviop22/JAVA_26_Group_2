package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.LectureHall;
import com.ECampus.model.ui.LectureHallDto;
import com.ECampus.service.shared.Mapper;

public class LectureHallMapper implements Mapper<LectureHallDto, LectureHall> {

    public LectureHallDto toDto(LectureHall entity) {
        return LectureHallDto.builder()
                .hallId(entity.getHallId())
                .capacity(entity.getCapacity())
                .status(entity.isStatus())
                .build();
    }
}
