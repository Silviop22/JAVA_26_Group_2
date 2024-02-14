package com.ECampus.service.shared;

<<<<<<< Updated upstream
public interface Mapper<T, E extends Object> {
    public T toDto(E entity);
}
=======
public interface Mapper <T, K extends Object> {
    public T toDto(K entity);
    public K toEntity(T dto);
}
>>>>>>> Stashed changes
