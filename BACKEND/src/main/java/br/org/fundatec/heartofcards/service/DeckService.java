package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.request.DeckRequest;
import br.org.fundatec.heartofcards.dto.response.DeckResponse;
import br.org.fundatec.heartofcards.repository.DeckRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService {

    private DeckRepository deckRepository;

    public List<DeckResponse> buscarDecks(){
        return null;
    }

    public DeckResponse buscarDeckPorNome(String nomeDoDeck){
        return null;
    }

    public DeckResponse criarNovoDeck(DeckRequest novoDeck){
        return null;
    }
}
