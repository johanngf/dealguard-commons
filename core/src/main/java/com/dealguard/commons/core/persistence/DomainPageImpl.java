package com.dealguard.commons.core.persistence;

import java.util.List;

/**
 * The interface Domain page.
 *
 * @param <T> the type parameter
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public class DomainPageImpl<T> implements DomainPage<T> {

    private final List<T> content;
    private final int pageNumber;
    private final int pageSize;
    private final long totalElements;

    public DomainPageImpl(List<T> content, int pageNumber, int pageSize, long totalElements) {
        this.content = content != null ? content : List.of();
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalElements = totalElements;
    }

    @Override
    public List<T> getContent() {
        return content;
    }

    @Override
    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public long getTotalElements() {
        return totalElements;
    }

    @Override
    public boolean isLast() {
        return pageNumber == getTotalPages() - 1;
    }

    @Override
    public boolean isFirst() {
        return pageNumber == 0;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public int getNumberOfElements() {
        return content.size();
    }
}
