package br.org.fundatec.heartofcards.stub;

import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.model.Conta;

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
