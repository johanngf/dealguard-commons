package com.dealguard.commons.core.usecase;

/**
 * The Domain Interface UseCase
 *
 * @author Breno Flaubert de Souza
 * @since 02/03/2025
 * @param <IN> the input from use case
 * @param <OUT> the output from use case;
 */
public interface UseCase<IN, OUT> {
    OUT execute(IN in);
}
