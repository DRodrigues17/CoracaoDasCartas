package br.org.fundatec.heartofcards.client;

import br.org.fundatec.heartofcards.dto.api.DeckApiResponse;
import br.org.fundatec.heartofcards.dto.api.YGOCardApiData;
import br.org.fundatec.heartofcards.dto.api.YGODeckApiData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "urldecks", url= "https://db.ygoprodeck.com/api/v7/cardsets.php")
public interface DecksClient {
    @RequestMapping(method = RequestMethod.GET)
    List<DeckApiResponse> buscarTodosDecks();
}
