package com.dealguard.commons.core.persistence;

/**
 * The Domain Class DomainPageableImpl
 *
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public class DomainPageableImpl implements DomainPageable {

    private final int pageNumber;
    private final int pageSize;
    private final DomainSort sort;

    DomainPageableImpl(int pageNumber, int pageSize, DomainSort sort) {
        this.pageNumber = Math.max(0, pageNumber);
        this.pageSize = Math.max(1, pageSize);
        this.sort = sort != null ? sort : DomainSort.unsorted();
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
    public DomainSort getSort() {
        return sort;
    }
}
