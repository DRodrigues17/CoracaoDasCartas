package com.drodrigues17.coracaodascartas.dto.response;

public record DeckResponse(
        String nome,
        String codigo,
        int numeroDeCartas,
        String dataDeLancamento,
        String imagem
) {
}
