package com.dealguard.commons.core.persistence;

import java.util.List;

/**
 * The Domain Interface DomainSort
 *
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public interface DomainSort {
    static DomainSort unsorted() {
        return new DomainUnsortedSort();
    }

    static DomainSort by(String... properties) {
        return new DomainSortImpl(properties);
    }

    boolean isSorted();

    List<DomainOrder> getOrders();
}
