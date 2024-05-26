package com.drodrigues17.coracaodascartas.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UsuarioAutenticacaoRequest(
        @Size(min = 8, max = 50, message = "o email deve ter entre {min} e {max} caracteres")
        @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+.+[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "o email deve conter @ e .com no seu corpo, não podendo estar em branco")
        String email,
        @NotBlank(message = "a senha não pode estar em branco")
        String senha
) {
}
