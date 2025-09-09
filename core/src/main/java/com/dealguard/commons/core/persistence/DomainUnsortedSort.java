package com.dealguard.commons.core.persistence;

import java.util.Collections;
import java.util.List;

/**
 * The Domain Class DomainUnsortedSort
 *
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public class DomainUnsortedSort implements DomainSort {

    @Override
    public boolean isSorted() {
        return false;
    }

    @Override
    public List<DomainOrder> getOrders() {
        return Collections.emptyList();
    }
}
