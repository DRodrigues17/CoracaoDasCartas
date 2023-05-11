package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.converter.CartaConverter;
import br.org.fundatec.heartofcards.dto.response.CartaResponse;
import br.org.fundatec.heartofcards.repository.CartaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartaService {

    private final CartaRepository cartaRepository;

    public Page<CartaResponse> buscarCartas() {
        return cartaRepository.findAll(Pageable.ofSize(30)).map(CartaConverter::converterParaResponse);
    }

    public CartaResponse buscarCartaPorNome(String nomeDaCarta) {

        return CartaConverter.converterParaResponse(cartaRepository.findByNome(nomeDaCarta));
    }

}
