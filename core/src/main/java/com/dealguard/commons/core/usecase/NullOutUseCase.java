package com.dealguard.commons.core.usecase;

/**
 * The Domain Interface NullOutUseCase
 *
 * @author Breno Flaubert de Souza
 * @since 02/03/2025
 * @param <IN> the input from use case
 */
public interface NullOutUseCase<IN> {
    void execute(IN input);
}