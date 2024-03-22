package com.drodrigues17.coracaodascartas.exception;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String message, Exception e) {
        super(message, e);
    }

    public SenhaInvalidaException(String message) {
        super(message);
    }
}
