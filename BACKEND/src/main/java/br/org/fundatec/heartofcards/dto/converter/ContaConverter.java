package br.org.fundatec.heartofcards.dto.converter;

import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.model.Conta;

public class ContaConverter {


    public static ContaResponse converterParaResponse(Conta conta) {
        return new ContaResponse(conta.getNomeDeUsuario());
    }

    public static Conta converterParaEntidade(ContaRequest request) {
        return Conta.builder()
                .nomeDeUsuario(request.nomeDeUsuario())
                .email(request.email())
                .senha(request.senha())
                .build();
    }
}
