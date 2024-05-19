package com.drodrigues17.coracaodascartas.service;

import com.drodrigues17.coracaodascartas.dto.mapper.DeckMapper;
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
            .map(DeckMapper::converterParaResponse)
            .toList();
    }

    public DeckResponse buscarDeckPorNome(String nomeDoDeck) {
        return DeckMapper.converterParaResponse(deckRepository.findByNome(nomeDoDeck).orElseThrow());
    }

    @Transactional
    public DeckResponse criarNovoDeck(DeckRequest novoDeck) {


        Deck deckQueVaiSerSalvoNoBanco = DeckMapper.converterParaEntidade(novoDeck);
        return DeckMapper.converterParaResponse(deckRepository.save(deckQueVaiSerSalvoNoBanco));
    }
}
