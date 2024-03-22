package com.drodrigues17.coracaodascartas.client.impl;

import com.drodrigues17.coracaodascartas.client.DecksClient;
import com.drodrigues17.coracaodascartas.dto.api.DeckApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DecksClientImpl implements DecksClient {

    private final DecksFeingCLient decksFeingCLient;

    @Override
    public List<DeckApiResponse> buscarTodosDecks() {
        return decksFeingCLient.buscarTodosDecks();
    }

    @FeignClient(name = "urldecks", url = "https://db.ygoprodeck.com/api/v7/cardsets.php")
    private interface DecksFeingCLient {

        @GetMapping
        List<DeckApiResponse> buscarTodosDecks();

    }
}
