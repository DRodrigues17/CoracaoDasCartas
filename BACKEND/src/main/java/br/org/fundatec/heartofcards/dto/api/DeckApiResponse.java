package br.org.fundatec.heartofcards.dto.api;

public record DeckApiResponse(
        String set_name,
        String set_code,
        int num_of_cards,
        String tcg_date,
        String set_image
) {
}
