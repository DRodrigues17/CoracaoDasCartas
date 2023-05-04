package br.org.fundatec.heartofcards.dto.response;

import br.org.fundatec.heartofcards.model.Deck;
import lombok.Builder;

import java.util.List;

@Builder
public record CartaResponse(
        String nome,
        String tipo,
        String descricaoDaCarta,
        List<Deck> decks,
        int pontosDeAtaque,
        int pontosDeDefesa,
        int nivel,
        String raca,
        String atributo

        ) {
}
