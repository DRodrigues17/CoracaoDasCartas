package com.drodrigues17.coracaodascartas.dto.mapper;

import com.drodrigues17.coracaodascartas.dto.request.UsuarioRequest;
import com.drodrigues17.coracaodascartas.dto.response.UsuarioResponse;
import com.drodrigues17.coracaodascartas.model.Usuario;
import com.drodrigues17.coracaodascartas.model.enums.Cargo;

public interface UsuarioMapper {


    static UsuarioResponse converterParaResponse(Usuario usuario, String token) {
        return UsuarioResponse.builder()
                .nome(usuario.getUsername())
                .token(token)
                .build();
    }

    static Usuario converterParaEntidade(UsuarioRequest request) {
        return Usuario.builder()
                .nome(request.nome())
                .email(request.email())
                .senha(request.senha())
                .cargo(Cargo.USUARIO)
                .build();
    }
}
