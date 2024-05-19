package com.drodrigues17.coracaodascartas.service;

import com.drodrigues17.coracaodascartas.dto.mapper.CartaMapper;
import com.drodrigues17.coracaodascartas.dto.response.CartaResponse;
import com.drodrigues17.coracaodascartas.repository.CartaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartaService {

    private final CartaRepository cartaRepository;

    public Page<CartaResponse> buscarCartas() {
        return cartaRepository.findAll(Pageable.ofSize(30)).map(CartaMapper::converterParaResponse);
    }

    public CartaResponse buscarCartaPorNome(String nomeDaCarta) {

         return CartaMapper.converterParaResponse(cartaRepository.buscarCartaPorNome(nomeDaCarta));
    }

}
