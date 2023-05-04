package br.org.fundatec.heartofcards.dto.api;

import br.org.fundatec.heartofcards.model.Deck;

import java.util.List;

public record CartaApiResponse(
        String name,
        String type,
        String desc,
        List<ImagesList> card_images,
        List<DeckApiResponse> card_sets,
        int atk,
        int def,
        int level,
        String race,
        String attribute
) {
}
