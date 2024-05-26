package com.drodrigues17.coracaodascartas.client;

import com.drodrigues17.coracaodascartas.dto.api.YGOCardApiData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ygprodeck", url = "https://db.ygoprodeck.com/api/v7/cardinfo.php")
public interface CartasClient {

    @GetMapping
    YGOCardApiData buscarTodasCartas();
}
