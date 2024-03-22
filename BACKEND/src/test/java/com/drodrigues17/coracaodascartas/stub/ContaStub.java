package com.drodrigues17.coracaodascartas.stub;

import com.drodrigues17.coracaodascartas.dto.request.ContaRequest;
import com.drodrigues17.coracaodascartas.dto.response.ContaResponse;
import com.drodrigues17.coracaodascartas.model.Conta;

public class ContaStub {

    public static Conta criarStrubDeConta() {
        return Conta.builder().nomeDeUsuario("danielRodrigues").email("daniel.rodrigues@outlook.com").senha("D@N17$123456")
                .build();
    }

    public static ContaRequest criarStrubDeContaRequest() {
        return new ContaRequest("danielRodrigues", "daniel.rodrigues@outlook.com", "D@N17$123456");
    }

    public static ContaResponse criarStrubDeContaResponse() {
        return new ContaResponse("daniel");
    }

}
