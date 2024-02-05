package com.ECampus.service;

import com.ECampus.model.Professor;
import com.ECampus.model.ui.ProfessorDto;
import com.ECampus.repository.ProfessorRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessorService {


    private final ProfessorRepository professorRepository;

    public ProfessorDto getById(Long id){
       Professor professor = professorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Professor not found."));
        return new ProfessorDto(professor.getProfessorId(),
                professor.getProfessorFirstName(),
                professor.getProfessorFirstName());
    }
}
