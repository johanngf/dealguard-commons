package com.dealguard.commons.core.event;

import java.time.LocalDateTime;

/**
 * The Class ApplicationEvent
 *
 * @author Breno Flaubert de Souza
 * @since 30/07/2025
 */
public record ApplicationEvent<T>(
        String eventName,
        LocalDateTime timestamp,
        String issuer,
        String traceId,
        String idempotenceId,
        T payload) {

}