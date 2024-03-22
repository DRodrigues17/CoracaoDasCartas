package com.drodrigues17.coracaodascartas.client;

import com.drodrigues17.coracaodascartas.dto.api.YGOCardApiData;

public interface CartasClient {
    YGOCardApiData buscarTodasCartas();
}
