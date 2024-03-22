package com.drodrigues17.coracaodascartas.dto.api;

import java.util.List;

public record YGOCardApiData(
        List<CartaApiResponse> data
) {

}
