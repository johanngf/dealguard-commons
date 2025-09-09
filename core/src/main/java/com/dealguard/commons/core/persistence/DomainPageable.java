package com.dealguard.commons.core.persistence;

/**
 * The Domain Interface DomainPageable
 *
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public interface DomainPageable {

    int getPageNumber();

    int getPageSize();

    DomainSort getSort();

    default DomainPageable next() {
        return of(getPageNumber() + 1, getPageSize(), getSort());
    }

    default DomainPageable previous() {
        return getPageNumber() == 0 ? this : of(getPageNumber() - 1, getPageSize(), getSort());
    }

    default DomainPageable first() {
        return getPageNumber() == 0 ? this : of(0, getPageSize(), getSort());
    }

    default boolean hasPrevious() {
        return getPageNumber() > 0;
    }

    static DomainPageable of(int pageNumber, int pageSize) {
        return new DomainPageableImpl(pageNumber, pageSize, DomainSort.unsorted());
    }

    static DomainPageable of(int pageNumber, int pageSize, DomainSort sort) {
        return new DomainPageableImpl(pageNumber, pageSize, sort);
    }
}
