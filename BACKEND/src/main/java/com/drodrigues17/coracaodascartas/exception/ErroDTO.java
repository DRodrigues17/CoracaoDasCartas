package com.drodrigues17.coracaodascartas.exception;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErroDTO {
    private String mensagem;

    private LocalDateTime timestamp;

    public ErroDTO(String mensagem, LocalDateTime timestamp) {
        this.mensagem = mensagem;
        this.timestamp = timestamp;
    }
}
