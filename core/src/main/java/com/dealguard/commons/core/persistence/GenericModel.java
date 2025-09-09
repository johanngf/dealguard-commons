package com.dealguard.commons.core.persistence;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The Class GenericModel
 *
 * @author Breno Flaubert de Souza
 * @since 25/03/2025
 */
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class GenericModel {

    protected UUID id;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
    protected LocalDateTime deletedAt;

    public void softDelete() {
        this.deletedAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenericModel that = (GenericModel) o;

        if (this.id == null || that.id == null) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}