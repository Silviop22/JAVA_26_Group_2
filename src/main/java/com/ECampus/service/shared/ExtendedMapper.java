package com.ECampus.service.shared;

import com.ECampus.model.Professor;
import com.ECampus.model.ui.ProfessorExtendedDto;

public interface ExtendedMapper<T, K, E extends Object> extends Mapper<T, E> {

    public K toExtendedDto(E entity);

    E toEntity(K extendedDto);
}
