package com.dealguard.commons.core.event;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The Class ApplicationEventFactory
 *
 * @author Breno Flaubert de Souza
 * @since 30/07/2025
 */
public class ApplicationEventFactory {
    public static <T> ApplicationEvent<T> of(String eventName, T payload) {
        return new ApplicationEvent<>(
                eventName,
                LocalDateTime.now(),
                "",
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                payload);
    }
}
