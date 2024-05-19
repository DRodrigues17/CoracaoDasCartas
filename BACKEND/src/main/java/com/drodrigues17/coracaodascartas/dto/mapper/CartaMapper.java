package com.drodrigues17.coracaodascartas.dto.mapper;

import com.drodrigues17.coracaodascartas.dto.api.ApiImageSet;
import com.drodrigues17.coracaodascartas.dto.api.CartaApiResponse;
import com.drodrigues17.coracaodascartas.dto.api.DeckApiResponse;
import com.drodrigues17.coracaodascartas.dto.response.CartaResponse;
import com.drodrigues17.coracaodascartas.model.ConjuntoDeImagens;
import com.drodrigues17.coracaodascartas.model.Deck;
import com.drodrigues17.coracaodascartas.model.carta.Carta;

import java.util.ArrayList;
import java.util.List;

public interface CartaMapper {

    static CartaResponse converterParaResponse(Carta carta) {
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


    static Carta converterParaEntidade(CartaApiResponse response) {
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
            listaDeDecks.add(DeckMapper.converterParaEntidade(deckResponse));
        }
        return listaDeDecks;
    }

    private static List<ConjuntoDeImagens> gerarListaDeImagens(List<ApiImageSet> response) {
        List<ConjuntoDeImagens> conjuntoDeImagens = new ArrayList<>();

        for (ApiImageSet deckResponse : response) {
            conjuntoDeImagens.add(ConjuntoDeImagensMapper.converterParaEntidade(deckResponse));
        }
        return conjuntoDeImagens;
    }


}
