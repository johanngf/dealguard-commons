package com.dealguard.commons.core.mapper;

/**
 * The Interface EntityMapper
 *
 * @author Breno Flaubert de Souza
 * @since 25/03/2025
 * @param <D> The Domain Class
 * @param <E> The Entity CLass
 */
public interface EntityMapper<D, E> {
    E toEntity(D domain);
    D toDomain(E entity);
}