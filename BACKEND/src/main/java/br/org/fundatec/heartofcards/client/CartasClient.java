package br.org.fundatec.heartofcards.client;

import br.org.fundatec.heartofcards.dto.api.YGOCardApiData;

public interface CartasClient {
    YGOCardApiData buscarTodasCartas();
}
