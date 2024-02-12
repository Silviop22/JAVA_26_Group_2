package com.ECampus.repository;

import com.ECampus.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

    @Query("SELECT r from Result r WHERE r.course.courseId = :courseId")
    List<Result> getResultByCourse(Long courseId);
    @Query("SELECT r from Result r WHERE r.student.id = :studentId AND r.course.courseId = :courseId")
    List<Result> getResultsByStudentIdAndCourseId(Long studentId, Long courseId);

}
