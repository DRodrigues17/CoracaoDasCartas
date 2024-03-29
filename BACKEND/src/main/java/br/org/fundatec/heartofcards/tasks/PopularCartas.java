package br.org.fundatec.heartofcards.tasks;

import br.org.fundatec.heartofcards.client.CartasClient;
import br.org.fundatec.heartofcards.dto.api.CartaApiResponse;
import br.org.fundatec.heartofcards.dto.converter.CartaConverter;
import br.org.fundatec.heartofcards.model.carta.Carta;
import br.org.fundatec.heartofcards.repository.CartaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.TimeZone;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Component
public class PopularCartas {

    private static final Logger LOGGER = Logger.getLogger(PopularCartas.class.getName());
    @Autowired
    private CartasClient client;
    @Autowired
    private CartaRepository repository;

    @Scheduled(fixedRate = 500000, zone = "America/Sao_Paulo")
    public void popularBanco() {

        for (CartaApiResponse cartaDaApi : client.buscarTodasCartas().data()) {


            Carta carta = CartaConverter.converterParaEntidade(cartaDaApi);

            if (!repository.findAll().contains(carta)) {
                repository.save(carta);
            }
        }


        LOGGER.info("Executando a tarefa no horário de " +
                LocalDateTime.now().atZone(TimeZone.getDefault().toZoneId()));

    }
}
