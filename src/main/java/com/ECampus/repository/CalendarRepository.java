package com.ECampus.repository;

import com.ECampus.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {

    @Query("SELECT c from Calendar c WHERE c.course.courseId = :courseId")
    Set<Calendar> findCalendarsByCourse(Long courseId);

//    @Query("SELECT c FROM Calendar c JOIN c.course co WHERE co.department = :department")
//    List<Calendar> findAcademicCalendarByDepartment(@Param("department") String department);


}