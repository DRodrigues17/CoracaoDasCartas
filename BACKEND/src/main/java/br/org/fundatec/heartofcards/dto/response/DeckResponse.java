package br.org.fundatec.heartofcards.dto.response;

public record DeckResponse(
        String nome,
        String codigo,
        int numeroDeCartas,
        String dataDeLancamento,
        String imagem
) {
}
