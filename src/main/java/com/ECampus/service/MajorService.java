package com.ECampus.service;

import com.ECampus.model.Major;
import com.ECampus.model.Student;
import com.ECampus.model.ui.MajorDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.repository.MajorRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MajorService {

    private final MajorRepository majorRepository;

    public MajorDto getById(Long id) {
        Major major = majorRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Major not found"));
        return new MajorDto(major.getMajorId(), major.getMajorName(), major.getStudentQuota());
    }
//    public Major createMajor(MajorDto majorDto) {
//        Optional<Major> existingMajor = majorRepository.existingMajor
//                (majorDto.getMajorName(),majorDto.getStudentQuota());
//        if (existingMajor.isPresent()) {
//            throw new EntityExistsException("Major with name " + majorDto.getMajorName() +
//                    " - "
//                    + majorDto.getStudentQuota() +" students, already exists.");
//        }
//        return majorRepository.save(MajorMapper.toEntity(majorDto));
//    }



}
