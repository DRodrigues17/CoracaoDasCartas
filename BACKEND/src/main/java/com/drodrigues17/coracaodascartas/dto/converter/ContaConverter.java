package com.drodrigues17.coracaodascartas.dto.converter;

import com.drodrigues17.coracaodascartas.dto.request.ContaRequest;
import com.drodrigues17.coracaodascartas.dto.response.ContaResponse;
import com.drodrigues17.coracaodascartas.model.Conta;

public interface ContaConverter {


    static ContaResponse converterParaResponse(Conta conta) {
        return new ContaResponse(conta.getNomeDeUsuario());
    }

    static Conta converterParaEntidade(ContaRequest request) {
        return Conta.builder()
                .nomeDeUsuario(request.nomeDeUsuario())
                .email(request.email())
                .senha(request.senha())
                .build();
    }
}
