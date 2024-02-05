package com.ECampus.service;

import com.ECampus.model.LectureHall;
import com.ECampus.model.ui.LectureHallDto;
import com.ECampus.repository.LectureHallRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureHallService {

    private final LectureHallRepository lectureHallRepository;

    public LectureHallDto getById(Long id) {
        LectureHall lectureHall= lectureHallRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Lecture hall not found."));
        return new LectureHallDto(lectureHall.getHallId(), lectureHall.isStatus(), lectureHall.getCapacity());

    }
}
