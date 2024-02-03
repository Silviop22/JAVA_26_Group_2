package com.ECampus.repository;

import com.ECampus.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByStudentFirstName(String studentFirstName);
    Optional<Student> findByStudentLastName(String studentLastName);



}
