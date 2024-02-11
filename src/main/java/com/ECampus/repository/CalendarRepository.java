package com.ECampus.repository;

import com.ECampus.model.Calendar;
import com.ECampus.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {

    @Query("SELECT c from Calendar c WHERE c.course.courseId = :courseId")
    List<Calendar> findCalendarsByCourse(Long courseId);


}