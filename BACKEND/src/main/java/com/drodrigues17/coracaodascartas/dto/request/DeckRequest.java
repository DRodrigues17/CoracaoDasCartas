package com.drodrigues17.coracaodascartas.dto.request;

public record DeckRequest(
     String nome,
     String codigo,
     int numeroDeCartas,
     String dataDeLancamento,
     String imagem
) {
}