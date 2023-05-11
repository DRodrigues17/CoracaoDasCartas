package br.org.fundatec.heartofcards.dto.response;

public record ConjuntoDeImagensResponse(
        String urlDaImagem,
        String urlDaImagemPequena,
        String urlDaImagemCortada
) {
}
