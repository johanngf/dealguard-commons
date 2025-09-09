package com.dealguard.commons.core.persistence;

/**
 * The Domain Class DomainUnsortedSort
 *
 * @author Breno Flaubert de Souza
 * @since 23/05/2025
 */
public class DomainOrder {

    private final String property;

    private final DomainDirection direction;

    private DomainOrder(String property, DomainDirection direction) {
        this.property = property;
        this.direction = direction;
    }

    public static DomainOrder asc(String property) {
        return new DomainOrder(property, DomainDirection.ASC);
    }

    public static DomainOrder desc(String property) {
        return new DomainOrder(property, DomainDirection.DESC);
    }

    public String getProperty() {
        return property;
    }

    public DomainDirection getDirection() {
        return direction;
    }
}
