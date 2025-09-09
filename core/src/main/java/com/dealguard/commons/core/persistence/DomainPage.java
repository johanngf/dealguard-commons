package com.dealguard.commons.core.persistence;

import java.util.List;

/**
 * The interface Domain page.
 *
 * @param <T> the type parameter
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public interface DomainPage<T> {

    List<T> getContent();

    int getPageNumber();

    int getPageSize();

    long getTotalElements();

    boolean isLast();

    boolean isFirst();

    default boolean isEmpty() {
        return getContent().isEmpty();
    }

    default int getTotalPages() {
        return getPageSize() == 0 ? 1 : (int) Math.ceil((double) getTotalElements() / (double) getPageSize());
    }

    default boolean hasNext() {
        return getPageNumber() <= getTotalPages() - 1;
    }

    default boolean hasPrevious() {
        return getPageNumber() > 0;
    }

    default int getNumberOfElements() {
        return getContent().size();
    }

    default boolean hasContent() {
        return !isEmpty();
    }

    default int getNextPageNumber() {
        return hasNext() ? getPageNumber() + 1 : getPageNumber();
    }

    default int getPreviousPageNumber() {
        return hasPrevious() ? getPageNumber() - 1 : getPageNumber();
    }
}
