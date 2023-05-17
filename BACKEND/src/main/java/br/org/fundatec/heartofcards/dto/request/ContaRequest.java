package br.org.fundatec.heartofcards.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ContaRequest(
        @NotBlank(message = "o nome não pode estar em branco")
        @Size (min = 8, max = 15, message = "seu nome deve ter entre {min} e {max} caracteres")
        String nomeDeUsuario,
        @Size(min = 8, max = 50, message = "o email deve ter entre {min} e {max} caracteres")
        @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+.+[a-z]{2,3}", flags = Pattern.Flag.CASE_INSENSITIVE, message = "o email deve conter @ e .com no seu corpo, não podendo estar em branco")
        String email,
        @NotBlank(message = "a senha não pode estar em branco")
     //   @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=S+$).{12,20}$", message = " a senha deve ter entre 12 e 20 caracteres, além disso, deve ter ao menos uma letra maiuscula, minuscula, número e caractere especial, isso é para que ela seja forte")
        String senha
) {
}
