package com.ECampus.service.shared;

<<<<<<< Updated upstream
import com.ECampus.model.Professor;
import com.ECampus.model.ui.ProfessorExtendedDto;

public interface ExtendedMapper<T, K, E extends Object> extends Mapper<T, E> {

    public K toExtendedDto(E entity);

    E toEntity(K extendedDto);
=======
public interface ExtendedMapper<T, K, E extends Object> {

    public T toDto(E entity);
    public K toExtendedDto(E entity);
    public E toEntity(K extendedDto);
>>>>>>> Stashed changes
}
