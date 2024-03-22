package com.drodrigues17.coracaodascartas.dto.response;

import com.drodrigues17.coracaodascartas.model.Deck;
import lombok.Builder;

import java.util.List;

@Builder
public record CartaResponse(
        String nome,
        String tipo,
        String descricaoDaCarta,
        List<Deck> decks,
        List<ConjuntoDeImagensResponse> imagensDaCarta,
        int pontosDeAtaque,
        int pontosDeDefesa,
        int nivel,
        String raca,
        String atributo

) {
}
