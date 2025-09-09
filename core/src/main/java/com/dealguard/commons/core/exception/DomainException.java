package com.dealguard.commons.core.exception;

import java.util.Collections;
import java.util.List;

/**
 * The Class Domain Exception
 * 
 * @author Breno Flaubert de Souza
 * @since 05/09/2025
 */
public class DomainException extends RuntimeException {
    
    private List<ErrorDetails> details = Collections.emptyList();

    public List<ErrorDetails> getDetails() {
        return details;
    }

    public DomainException(String message, Throwable cause){
        super(message, cause);
    }

    public DomainException(String message, Throwable cause, List<ErrorDetails> details){
        super(message, cause);
        this.details = details;
    }
}
