package com.drodrigues17.coracaodascartas.client;

import com.drodrigues17.coracaodascartas.dto.api.DeckApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "urldecks", url = "https://db.ygoprodeck.com/api/v7/cardsets.php")
public interface DecksClient {

    @GetMapping
    List<DeckApiResponse> buscarTodosDecks();
}
