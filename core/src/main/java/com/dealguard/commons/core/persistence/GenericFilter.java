package com.dealguard.commons.core.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * The Domain Class GenericFilter
 *
 * @author Breno Flaubert de Souza
 * @since 23/06/2025
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class GenericFilter {

    private String searchTerm;

    private Integer page;

    private Integer size;

    private String sortBy;

    private String sortDirection;

    private Boolean last;

    private Boolean first;

    public GenericFilter(
            String searchTerm,
            Integer page,
            Integer size,
            String sortBy,
            String sortDirection,
            Boolean last,
            Boolean first
    ) {
        this.searchTerm = searchTerm;
        this.page = page;
        this.size = size;
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
        this.last = last;
        this.first = first;
    }

    public boolean hasSearchTerm() {
        return searchTerm != null && !searchTerm.isEmpty();
    }

    public DomainPageable toPageable(long totalElements) {
        this.page = getPage(totalElements);
        return DomainPageable.of(
                page,
                size,
                DomainSort.by(sortBy, sortDirection)
        );
    }

    public String getSearchTerm() {
        return searchTerm != null ? searchTerm : "";
    }

    public Integer getSize() {
        return size != null ? size : 10;
    }

    public String getSortBy() {
        return sortBy != null ? sortBy : "id";
    }

    public String getSortDirection() {
        return sortDirection != null ? sortDirection : "asc";
    }

    public boolean isLast() {
        return last != null && last;
    }

    public boolean isFirst() {
        return first != null && first;
    }

    public int getPage(long totalElements) {
        if (isFirst()) {
            return 0;
        }
        if (isLast()) {
            int pageSize = getSize();
            int lastPage = (int) ((totalElements + pageSize - 1) / pageSize) - 1;
            return Math.max(lastPage, 0);
        }
        return page != null ? page : 0;
    }
}
