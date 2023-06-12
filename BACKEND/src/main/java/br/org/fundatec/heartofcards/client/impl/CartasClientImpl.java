package br.org.fundatec.heartofcards.client.impl;

import br.org.fundatec.heartofcards.client.CartasClient;
import br.org.fundatec.heartofcards.dto.api.YGOCardApiData;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@RequiredArgsConstructor
public class CartasClientImpl implements CartasClient {

    private final CartasFeingClient cartasFeingClient;

    @Override
    public YGOCardApiData buscarTodasCartas() {
        return cartasFeingClient.buscarTodasCartas();
    }

    @FeignClient(name = "ygprodeck", url = "https://db.ygoprodeck.com/api/v7/cardinfo.php")
    private interface CartasFeingClient {

        @GetMapping
        YGOCardApiData buscarTodasCartas();

    }
}
