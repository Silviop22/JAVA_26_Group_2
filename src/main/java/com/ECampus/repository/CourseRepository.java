package com.ECampus.repository;

import com.ECampus.model.Course;
import com.ECampus.model.Major;
import com.ECampus.model.Student;
import com.ECampus.model.ui.MajorEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT s FROM Student s JOIN s.courses c WHERE c.id = :courseId")
    List<Student> findEnrolledStudentsByCourseId(Long courseId);
    Optional<Course> existingCourse(String courseName, float courseECTS);



}
