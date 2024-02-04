package com.ECampus.service;

import com.ECampus.model.Major;
import com.ECampus.model.ui.MajorDto;
import com.ECampus.repository.MajorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MajorService {

    private final MajorRepository majorRepository;

    public MajorDto getById(Long id) {
        Major major = majorRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Major not found"));
        return new MajorDto(major.getMajorId(), major.getStudentQuota());
    }

}
