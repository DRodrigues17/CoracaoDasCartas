package br.org.fundatec.heartofcards.dto.api;

public record ApiImageSet(
        String image_url,
        String image_url_small,
        String image_url_cropped
) {
}
