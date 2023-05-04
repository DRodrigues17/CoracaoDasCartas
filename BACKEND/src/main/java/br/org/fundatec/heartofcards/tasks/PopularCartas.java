package br.org.fundatec.heartofcards.tasks;

import br.org.fundatec.heartofcards.client.CartasClient;
import br.org.fundatec.heartofcards.client.DecksClient;
import br.org.fundatec.heartofcards.dto.api.CartaApiResponse;
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

    @Autowired
    private CartasClient client;

    private CartaRepository repository;

    private static final Logger LOGGER = Logger.getLogger(PopularCartas.class.getName());

    @Scheduled(fixedRate = 500000, zone = "America/Sao_Paulo")
    public void popularBanco() {
        LOGGER.info(client.buscarTodasCartas().toString());
//        for (CartaApiResponse carta : client.buscarTodasCartas()) {
//            LOGGER.info(carta.toString());
//        }


        LOGGER.info("Executando a tarefa no horário de " +
                LocalDateTime.now().atZone(TimeZone.getDefault().toZoneId()));

    }
}
