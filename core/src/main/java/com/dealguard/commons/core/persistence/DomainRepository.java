package com.dealguard.commons.core.persistence;

import java.util.List;
import java.util.Optional;

/**
 * The Domain Interface DomainRepository
 *
 * @author Breno Flaubert de Souza
 * @since 09/05/2025
 * @param <T>
 * @param <ID>
 */
public interface DomainRepository<T, ID> {

    T save(T entity);

    Optional<T> findById(ID id);

    List<T> findAll();

    boolean existsById(ID id);

    long count();

    void deleteById(ID id);

    void delete(T entity);

    void deleteAll();

    List<T> saveAll(Iterable<T> entities);

    List<T> findAll(int page, int size, String sortBy);
}

