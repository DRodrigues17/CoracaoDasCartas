package br.org.fundatec.heartofcards.dto.converter;

import br.org.fundatec.heartofcards.dto.api.ApiImageSet;
import br.org.fundatec.heartofcards.dto.api.CartaApiResponse;
import br.org.fundatec.heartofcards.dto.api.DeckApiResponse;
import br.org.fundatec.heartofcards.dto.response.CartaResponse;
import br.org.fundatec.heartofcards.model.ConjuntoDeImagens;
import br.org.fundatec.heartofcards.model.Deck;
import br.org.fundatec.heartofcards.model.carta.Carta;

import java.util.ArrayList;
import java.util.List;

public class CartaConverter {

    public static CartaResponse converterParaResponse(Carta carta) {
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


    public static Carta converterParaEntidade(CartaApiResponse response) {
        return Carta.builder()
                .nome(response.name())
                .tipo(response.type())
                .descricaoDaCarta(response.desc())
                .imagensDaCarta(gerarListaDeImagens(response.card_images()))
                .pontosDeAtaque(response.atk())
                .pontosDeDefesa(response.def())
                .nivel(response.level())
                .raca(response.race())
                .atributo(response.attribute())
                .build();
    }


    private static List<Deck> gerarListaDeDecks(List<DeckApiResponse> response) {
        List<Deck> listaDeDecks = new ArrayList<>();

        for (DeckApiResponse deckResponse : response) {
            listaDeDecks.add(DeckConverter.converterParaEntidade(deckResponse));
        }
        return listaDeDecks;
    }

    private static List<ConjuntoDeImagens> gerarListaDeImagens(List<ApiImageSet> response) {
        List<ConjuntoDeImagens> conjuntoDeImagens = new ArrayList<>();

        for (ApiImageSet deckResponse : response) {
            conjuntoDeImagens.add(ConjuntoDeImagensConverter.converterParaEntidade(deckResponse));
        }
        return conjuntoDeImagens;
    }


}
