package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.response.CartaResponse;
import br.org.fundatec.heartofcards.repository.CartaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaService {

    private CartaRepository cartaRepository;

    public List<CartaResponse> buscarCartas() {
        return null;
    }

    public CartaResponse buscarCartaPorNome(String nomeDaCarta) {
        return null;
    }
    public CartaResponse buscarCartaPorTipo(String tipoDaCarta) {
        return null;
    }



}
