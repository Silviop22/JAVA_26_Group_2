package com.ECampus.service;

import com.ECampus.model.Result;
import com.ECampus.model.ui.ResultDto;
import com.ECampus.repository.ResultRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;

    public ResultDto getById(Long id) {
        Result result = resultRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Results not found."));
        return new ResultDto(result.getResultId(), result.getGrade());
    }
}
