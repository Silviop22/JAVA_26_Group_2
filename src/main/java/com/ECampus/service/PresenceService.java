package com.ECampus.service;

import com.ECampus.model.Presence;
import com.ECampus.model.ui.PresenceDto;
import com.ECampus.repository.PresenceRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PresenceService {

    private final PresenceRepository presenceRepository;

    public PresenceDto getById(Long id){
        Presence presence = presenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Presence not found."));
        return new PresenceDto(presence.getPresenceId(), presence.getPresence(), presence.isPresenceStatus());
    }
}
