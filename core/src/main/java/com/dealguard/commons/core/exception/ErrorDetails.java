package com.dealguard.commons.core.exception;

import lombok.Builder;

/**
 * The Record ErrorDetails
 * 
 * @author Breno Flaubert de Souza
 * @since 05/09/2025
 */
@Builder
public record ErrorDetails(String field, String message) {
    
}
