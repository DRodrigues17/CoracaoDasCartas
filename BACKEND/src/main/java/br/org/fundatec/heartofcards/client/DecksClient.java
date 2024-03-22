package br.org.fundatec.heartofcards.client;

import br.org.fundatec.heartofcards.dto.api.DeckApiResponse;

import java.util.List;


public interface DecksClient {

    List<DeckApiResponse> buscarTodosDecks();
}
