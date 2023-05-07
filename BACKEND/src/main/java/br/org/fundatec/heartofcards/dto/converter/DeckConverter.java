package br.org.fundatec.heartofcards.dto.converter;

import br.org.fundatec.heartofcards.dto.api.DeckApiResponse;
import br.org.fundatec.heartofcards.dto.response.DeckResponse;
import br.org.fundatec.heartofcards.model.Deck;

public class DeckConverter {

    public static DeckResponse converterParaResponse(Deck deck) {
        return new DeckResponse(deck.getNome(), deck.getCodigo(), deck.getNumeroDeCartas(), deck.getDataDeLancamento(), deck.getImagem());
    }

    public static Deck converterParaEntidade(DeckApiResponse apiResponse) {
        return Deck.builder()
                .nome(apiResponse.set_name())
                .codigo(apiResponse.set_code())
                .numeroDeCartas(apiResponse.num_of_cards())
                .dataDeLancamento(apiResponse.tcg_date())
                .imagem(apiResponse.set_image())
                .build();
    }
}
