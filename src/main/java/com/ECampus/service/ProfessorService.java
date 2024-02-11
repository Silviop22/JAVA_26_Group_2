package com.ECampus.service;

import com.ECampus.model.Professor;
import com.ECampus.model.Student;
import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.model.ui.ProfessorExtendedDto;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.repository.ProfessorRepository;
import com.ECampus.repository.StudentRepository;
import com.ECampus.service.shared.ProfessorMapper;
import com.ECampus.service.shared.StudentMapper;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfessorService {


    private final ProfessorRepository professorRepository;
    private final ProfessorMapper professorMapper;




    private Professor findExistingProfessor(Long id) {
        return professorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Professor with id " + id + " not found"));
    }
    public ProfessorDto getById(Long id){
        Professor professor = professorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Professor not found."));
        return new ProfessorDto(professor.getId(),
                professor.getFirstName(),
                professor.getLastName());
    }


    public ProfessorExtendedDto getProfessorById(Long id) {
       Professor professor = findExistingProfessor(id);
        return professorMapper.toExtendedDto(professor);
    }

    public Set<ProfessorDto> getList() {
        return professorRepository.findAll()
                .stream()
                .map(professorMapper::toDto)
                .collect(Collectors.toSet());
    }

    public Professor createProfessor(ProfessorExtendedDto professor) {
        Optional<Professor> existingProfessor = professorRepository.findByProfessorFirstNameAndProfessorLastNameAndProfessorEmail
                (professor.getFirstName(), professor.getLastName(), professor.getEmail());
        if (existingProfessor.isPresent()) {
            throw new EntityExistsException("Professor with name " + professor.getFirstName() + " "
                    + professor.getLastName()+", with email "
                    + professor.getEmail() +" already exists.");
        }
        return professorRepository.save(professorMapper.toEntity(professor));
    }


    public void deleteProfessor(Long id) {
        Professor professor = findExistingProfessor(id);
        professorRepository.delete(professor);
    }

}
