package com.drodrigues17.coracaodascartas.stub;

import com.drodrigues17.coracaodascartas.dto.request.UsuarioRequest;
import com.drodrigues17.coracaodascartas.dto.response.UsuarioResponse;
import com.drodrigues17.coracaodascartas.model.Usuario;

public class ContaStub {

    public static Usuario criarStrubDeConta() {
        return Usuario.builder().nome("danielRodrigues").email("daniel.rodrigues@outlook.com").senha("D@N17$123456")
                .build();
    }

    public static UsuarioRequest criarStrubDeContaRequest() {
        return new UsuarioRequest("danielRodrigues", "daniel.rodrigues@outlook.com", "D@N17$123456");
    }

    public static UsuarioResponse criarStrubDeContaResponse() {
        return new UsuarioResponse("daniel");
    }

}
