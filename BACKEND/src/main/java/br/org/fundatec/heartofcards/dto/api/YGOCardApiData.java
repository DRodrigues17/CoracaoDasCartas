package br.org.fundatec.heartofcards.dto.api;

import java.util.List;

public record YGOCardApiData(
        List<CartaApiResponse> data
) {

}
