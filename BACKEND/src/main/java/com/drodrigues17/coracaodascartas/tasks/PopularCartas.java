package com.drodrigues17.coracaodascartas.tasks;

import com.drodrigues17.coracaodascartas.client.CartasClient;
import com.drodrigues17.coracaodascartas.dto.api.CartaApiResponse;
import com.drodrigues17.coracaodascartas.dto.converter.CartaConverter;
import com.drodrigues17.coracaodascartas.model.carta.Carta;
import com.drodrigues17.coracaodascartas.repository.CartaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.TimeZone;
import java.util.logging.Logger;

@RequiredArgsConstructor
@Component
public class PopularCartas {

    private static final Logger LOGGER = Logger.getLogger(PopularCartas.class.getName());

    private final CartasClient client;

    private final CartaRepository repository;

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
