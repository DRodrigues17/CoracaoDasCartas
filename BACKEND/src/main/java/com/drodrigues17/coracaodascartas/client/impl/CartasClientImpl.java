package com.drodrigues17.coracaodascartas.client.impl;

import com.drodrigues17.coracaodascartas.client.CartasClient;
import com.drodrigues17.coracaodascartas.dto.api.YGOCardApiData;
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
