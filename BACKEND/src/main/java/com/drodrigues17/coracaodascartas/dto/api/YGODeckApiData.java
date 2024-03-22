package com.drodrigues17.coracaodascartas.dto.api;


import java.util.List;

public record YGODeckApiData(
        List<DeckApiResponse> data
) {
}
