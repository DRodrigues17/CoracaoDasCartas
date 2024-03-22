package com.drodrigues17.coracaodascartas.exception;

import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RestControllerAdvice
public class ExceptionHandlerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<ErroDTO> tratarViolacaoDeConstraint(MethodArgumentNotValidException e) {
        List<String> detalhesDosErros = new ArrayList<>();
        for (ObjectError erro : e.getBindingResult().getAllErrors()) {
            detalhesDosErros.add(erro.getDefaultMessage());
        }

        logger.error(e.getMessage());
        return new ResponseEntity<>(buildError("Sua conta não pode ser criada pelos seguintes motivos " + detalhesDosErros)
                , HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(FeignException.NotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErroDTO> tratarCartaNaoEncontrada(FeignException.NotFound e) {


        logger.error(e.getMessage());
        return new ResponseEntity<>(buildError("A carta " + e.getMessage() + "não foi encontrada")
                , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<ErroDTO> tratarListaVazia(IllegalStateException e) {
        logger.error(e.getMessage());
        return new ResponseEntity<>(buildError("não possuimos nenhuma carta que se encaixa nesses parametros"), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(ContaNaoEncontradaException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseEntity<ErroDTO> tratarContaNaoEncontrada(ContaNaoEncontradaException e) {
        logger.error(e.getMessage());

        return new ResponseEntity<>(buildError("Nenhuma conta com o email " + e.getMessage() + " foi encontrada em nosso sistema, verifique as credenciais"), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(SenhaInvalidaException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseEntity<ErroDTO> tratarSenhaIncorreta(SenhaInvalidaException e) {
        logger.error(e.getMessage());

        return new ResponseEntity<>(buildError("A senha " + e.getMessage() + " não corresponde com a dessa conta, verifique as credenciais"), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public ResponseEntity<ErroDTO> tratarErroDesconheciodo(Throwable e) {
        logger.error(e.getMessage());
        return new ResponseEntity<>(buildError("Este erro é desconhecido, então não temos um tratamento para isso ainda"),
                HttpStatus.I_AM_A_TEAPOT);
    }

    private ErroDTO buildError(String message) {
        return new ErroDTO(message, LocalDateTime.now());
    }
}
