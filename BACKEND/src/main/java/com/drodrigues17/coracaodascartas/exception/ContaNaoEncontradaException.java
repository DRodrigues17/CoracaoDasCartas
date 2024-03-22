package com.drodrigues17.coracaodascartas.exception;

public class ContaNaoEncontradaException extends RuntimeException {

    public ContaNaoEncontradaException(String message, Exception e) {
        super(message, e);
    }

    public ContaNaoEncontradaException(String message) {
        super(message);
    }
}
