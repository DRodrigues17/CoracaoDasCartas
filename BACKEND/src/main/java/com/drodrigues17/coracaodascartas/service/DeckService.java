package com.drodrigues17.coracaodascartas.service;

import com.drodrigues17.coracaodascartas.dto.converter.DeckConverter;
import com.drodrigues17.coracaodascartas.dto.request.DeckRequest;
import com.drodrigues17.coracaodascartas.dto.response.DeckResponse;
import com.drodrigues17.coracaodascartas.model.Deck;
import com.drodrigues17.coracaodascartas.repository.DeckRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeckService {

    private final DeckRepository deckRepository;

    public List<DeckResponse> buscarTodosDecks() {
        return deckRepository
            .findAll()
            .stream()
            .map(DeckConverter::converterParaResponse)
            .toList();
    }

    public DeckResponse buscarDeckPorNome(String nomeDoDeck) {
        return DeckConverter.converterParaResponse(deckRepository.findByNomme(nomeDoDeck).orElseThrow());
    }

    @Transactional
    public DeckResponse criarNovoDeck(DeckRequest novoDeck) {


        Deck deckQueVaiSerSalvoNoBanco = DeckConverter.converterParaEntidade(novoDeck);
        return DeckConverter.converterParaResponse(deckRepository.save(deckQueVaiSerSalvoNoBanco));
    }
}
