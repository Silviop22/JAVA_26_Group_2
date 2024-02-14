package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Result;
import com.ECampus.model.ui.ResultDto;
import com.ECampus.service.shared.Mapper;

public class ResultMapper implements Mapper<ResultDto, Result> {

    public ResultDto toDto(Result entity) {
        return ResultDto.builder()
                .resultId(entity.getResultId())
                .grade(entity.getGrade())
                .build();
    }
}
