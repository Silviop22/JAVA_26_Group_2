package com.ECampus.model.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResultDto {
    private int resultId;
    private int grade;
    public ResultDto(int resultId, int grade) {
        this.resultId = resultId;
        this.grade = grade;
    }
}
