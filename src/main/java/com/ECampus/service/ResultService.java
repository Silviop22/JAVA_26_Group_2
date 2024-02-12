package com.ECampus.service;

import com.ECampus.model.Result;
import com.ECampus.model.ui.ResultDto;
import com.ECampus.repository.ResultRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;


    public ResultDto getById(Long id) {
        Result result = resultRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Results not found."));
        return new ResultDto(result.getResultId(), result.getGrade());
    }

    public List<ResultDto> getByStudentIdAndCourseId(Long studentId, Long courseId) {
        return resultRepository.getResultsByStudentIdAndCourseId(studentId, courseId).stream()
                .map(r -> new ResultDto(r.getResultId(), r.getGrade()))
                .toList();
    }
}
