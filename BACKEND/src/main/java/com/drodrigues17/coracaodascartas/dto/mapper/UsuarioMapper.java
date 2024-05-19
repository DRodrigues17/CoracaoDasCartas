package com.drodrigues17.coracaodascartas.dto.mapper;

import com.drodrigues17.coracaodascartas.dto.request.UsuarioRequest;
import com.drodrigues17.coracaodascartas.dto.response.UsuarioResponse;
import com.drodrigues17.coracaodascartas.model.Usuario;

public interface UsuarioMapper {


    static UsuarioResponse converterParaResponse(Usuario usuario) {
        return new UsuarioResponse(usuario.getUsername());
    }

    static Usuario converterParaEntidade(UsuarioRequest request) {
        return Usuario.builder()
                .nome(request.nome())
                .email(request.email())
                .senha(request.senha())
                .build();
    }
}
