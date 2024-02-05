package com.ECampus.repository;

import com.ECampus.model.LectureHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureHallRepository extends JpaRepository<LectureHall, Long> {
}
