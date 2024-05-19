package com.drodrigues17.coracaodascartas.exception;

public class UsuarioNaoEncontradoException extends RuntimeException {

    public UsuarioNaoEncontradoException(String message, Exception e) {
        super(message, e);
    }

    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }
}
