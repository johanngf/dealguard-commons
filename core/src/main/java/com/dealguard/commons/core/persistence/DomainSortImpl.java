package com.dealguard.commons.core.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Domain Interface DomainSortImpl
 *
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public class DomainSortImpl implements DomainSort {

    private final List<DomainOrder> orders;

    DomainSortImpl(String... properties) {
        this.orders = Arrays.stream(properties)
                .map(DomainOrder::asc)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isSorted() {
        return !orders.isEmpty();
    }

    @Override
    public List<DomainOrder> getOrders() {
        return orders;

    }
}