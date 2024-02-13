package com.ECampus.service;

import com.ECampus.model.LectureHall;
import com.ECampus.model.Student;
import com.ECampus.model.ui.LectureHallDto;
import com.ECampus.repository.LectureHallRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LectureHallService {

    private final LectureHallRepository lectureHallRepository;

    public LectureHallDto getById(Long id) {
        LectureHall lectureHall= lectureHallRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Lecture hall not found."));
        return new LectureHallDto(lectureHall.getHallId(), lectureHall.isStatus(), lectureHall.getCapacity());

    }
//  public LectureHallDto createNewLectureHall(LectureHall lectureHall){
//      Optional<LectureHall> existingLectureHall = lectureHallRepository.findByLectureHallStatusAndLectureHallCapacity
//              (lectureHall.isStatus(), lectureHall.getCapacity());
//      if (existingLectureHall.isPresent()) {
//          throw new EntityExistsException("Status" + lectureHall.isStatus()+ "Capacity "
//                  + lectureHall.getCapacity()+ " already exists.");
//      }
//
//      return new LectureHallDto(savedLectureHall.getHallId(),
//              savedLectureHall.isStatus(), savedLectureHall.getCapacity());
//
//  }





}
