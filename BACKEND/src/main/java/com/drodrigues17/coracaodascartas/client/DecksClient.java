package com.drodrigues17.coracaodascartas.client;

import com.drodrigues17.coracaodascartas.dto.api.DeckApiResponse;

import java.util.List;


public interface DecksClient {

    List<DeckApiResponse> buscarTodosDecks();
}
