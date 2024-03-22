package com.drodrigues17.coracaodascartas.dto.api;

import java.util.List;

public record CartaApiResponse(
        String name,
        String type,
        String desc,
        List<ApiImageSet> card_images,
        List<DeckApiResponse> card_sets,
        int atk,
        int def,
        int level,
        String race,
        String attribute
) {
}
