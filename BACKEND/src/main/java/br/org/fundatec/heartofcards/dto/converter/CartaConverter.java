package br.org.fundatec.heartofcards.dto.converter;

import br.org.fundatec.heartofcards.dto.response.CartaResponse;
import br.org.fundatec.heartofcards.model.carta.Carta;
import br.org.fundatec.heartofcards.model.carta.CartaArmadilha;
import br.org.fundatec.heartofcards.model.carta.CartaMagia;
import br.org.fundatec.heartofcards.model.carta.CartaMonstro;

public class CartaConverter {

    public static CartaResponse converterParaResponse(Carta carta) {
        if (carta.getTipo().contains("monster")){
            return converterParaResponse(carta);
        } else if (carta.getTipo().contains("spell")) {
            return converterParaResponse(carta);
        }
        return converterParaResponse(carta);
    }


    private static CartaResponse converterParaResponse(CartaMonstro carta){
        return CartaResponse.builder()
                .nome(carta.getNome())
                .tipo(carta.getTipo())
                .descricaoDaCarta(carta.getDescricaoDaCarta())
                .decks(carta.getDecks())
                .pontosDeAtaque(carta.getPontosDeAtaque())
                .pontosDeDefesa(carta.getPontosDeDefesa())
                .nivel(carta.getNivel())
                .raca(carta.getRaca())
                .atributo(carta.getAtributo())
                .build();
    }
    private static CartaResponse converterParaResponse(CartaMagia carta){
        return CartaResponse.builder()
                .nome(carta.getNome())
                .tipo(carta.getTipo())
                .descricaoDaCarta(carta.getDescricaoDaCarta())
                .decks(carta.getDecks())
                .build();
    }
    private static CartaResponse converterParaResponse(CartaArmadilha carta){
        return CartaResponse.builder()
                .nome(carta.getNome())
                .tipo(carta.getTipo())
                .descricaoDaCarta(carta.getDescricaoDaCarta())
                .decks(carta.getDecks())
                .build();
    }



    public static Carta converterParaEntidade(CartaResponse response) {
        if (response.tipo().contains("monster")) {
            return gerarCartaMonstro(response);
        } else if (response.tipo().contains("spell")) {
            return gerarCartaMagia(response);
        }
        return gerarCartaArmadilha(response);
    }

    private static CartaMonstro gerarCartaMonstro(CartaResponse response) {
        return CartaMonstro.builder()
                .nome(response.nome())
                .tipo(response.tipo())
                .descricaoDaCarta(response.descricaoDaCarta())
                .decks(response.decks())
                .pontosDeAtaque(response.pontosDeAtaque())
                .pontosDeDefesa(response.pontosDeDefesa())
                .nivel(response.nivel())
                .raca(response.raca())
                .atributo(response.atributo())
                .build();
    }

    private static CartaMagia gerarCartaMagia(CartaResponse response) {
        return CartaMagia.builder()
                .nome(response.nome())
                .tipo(response.tipo())
                .descricaoDaCarta(response.descricaoDaCarta())
                .decks(response.decks())
                .build();
    }

    private static CartaArmadilha gerarCartaArmadilha(CartaResponse response) {
        return CartaArmadilha.builder()
                .nome(response.nome())
                .tipo(response.tipo())
                .descricaoDaCarta(response.descricaoDaCarta())
                .decks(response.decks())
                .build();
    }
}
