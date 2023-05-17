package br.org.fundatec.heartofcards.exception;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String message, Exception e) {
        super(message, e);
    }

    public SenhaInvalidaException(String message) {
        super(message);
    }
}
