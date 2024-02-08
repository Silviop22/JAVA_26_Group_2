package com.ECampus.repository;

import com.ECampus.model.Professor;
import com.ECampus.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Optional<Professor> findByProfessorFirstNameAndProfessorLastNameAndProfessorEmail
            (String studentFirstName, String studentLastName, String professorEmail);

}
