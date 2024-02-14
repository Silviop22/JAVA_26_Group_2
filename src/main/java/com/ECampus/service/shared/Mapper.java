package com.ECampus.service.shared;

public interface Mapper<T, E extends Object> {
    public T toDto(E entity);
}