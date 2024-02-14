package com.ECampus.repository;

import com.ECampus.model.Group;
import com.ECampus.model.LectureHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LectureHallRepository extends JpaRepository<LectureHall, Long> {
    Optional<LectureHall> findByLectureHallStatusAndLectureHallCapacity(boolean lectureHallStatus, int lectureHallCapacity);

}
