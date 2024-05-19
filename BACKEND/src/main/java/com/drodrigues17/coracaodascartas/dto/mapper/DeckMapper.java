package com.drodrigues17.coracaodascartas.dto.mapper;

import com.drodrigues17.coracaodascartas.dto.api.DeckApiResponse;
import com.drodrigues17.coracaodascartas.dto.request.DeckRequest;
import com.drodrigues17.coracaodascartas.dto.response.DeckResponse;
import com.drodrigues17.coracaodascartas.model.Deck;

public interface DeckMapper {

    static DeckResponse converterParaResponse(Deck deck) {
        return new DeckResponse(deck.getNome(), deck.getCodigo(), deck.getNumeroDeCartas(), deck.getDataDeLancamento(), deck.getImagem());
    }

    static Deck converterParaEntidade(DeckApiResponse apiResponse) {
        return Deck.builder()
                .nome(apiResponse.set_name())
                .codigo(apiResponse.set_code())
                .numeroDeCartas(apiResponse.num_of_cards())
                .dataDeLancamento(apiResponse.tcg_date())
                .imagem(apiResponse.set_image())
                .build();
    }

    static Deck converterParaEntidade(DeckRequest deckRequest) {
        return Deck.builder()
            .nome(deckRequest.nome())
            .codigo(deckRequest.codigo())
            .numeroDeCartas(deckRequest.numeroDeCartas())
            .dataDeLancamento(deckRequest.dataDeLancamento())
            .imagem(deckRequest.imagem())
            .build();
    }
}
