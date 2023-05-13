package br.org.fundatec.heartofcards.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContaRequest(
        @NotBlank(message = "")
        @Size (min = 8, max = 10, message = "")
        String nomeDeUsuario,
        @Email(regexp = "", message = "")
        String email,
        @NotBlank(message = "")
        @Size(min = 12, max = 20, message = "")
        String senha
) {
}
