package br.org.fundatec.heartofcards.dto.api;


import java.util.List;

public record YGODeckApiData(
        List<DeckApiResponse> data
) {
}
