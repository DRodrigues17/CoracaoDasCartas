package com.drodrigues17.coracaodascartas.dto.response;

import lombok.Builder;

@Builder
public record UsuarioResponse(
        String nome,
        String token
) {
}
