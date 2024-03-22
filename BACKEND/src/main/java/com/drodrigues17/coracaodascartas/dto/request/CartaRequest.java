package com.drodrigues17.coracaodascartas.dto.request;

import java.util.List;

public record CartaRequest(
        String nome,
        String tipo,
        String descricaoDaCarta,
        List<DeckRequest> decks,

        int pontosDeAtaque,
        int pontosDeDefesa,
        int nivel,
        String raca,
        String atributo
) {
}
