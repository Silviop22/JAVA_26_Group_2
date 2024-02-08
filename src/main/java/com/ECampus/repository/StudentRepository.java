package com.ECampus.repository;

import com.ECampus.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentFirstNameAndStudentLastNameAndEmail(String studentFirstName, String studentLastName, String email);



}
