package com.drodrigues17.coracaodascartas.service;

import com.drodrigues17.coracaodascartas.dto.mapper.UsuarioMapper;
import com.drodrigues17.coracaodascartas.dto.request.UsuarioRequest;
import com.drodrigues17.coracaodascartas.dto.response.UsuarioResponse;
import com.drodrigues17.coracaodascartas.exception.UsuarioNaoEncontradoException;
import com.drodrigues17.coracaodascartas.repository.UsuarioRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Transactional
    public String criarConta(@Valid UsuarioRequest request) {
        usuarioRepository.save(UsuarioMapper.converterParaEntidade(request));

        return "o usuário " + request.nome() + " teve sua conta criada com sucesso";
    }

    public UsuarioResponse realizarLogin(String email, String senha) {
        return UsuarioMapper
                .converterParaResponse(usuarioRepository.buscarPorEmailESenha(email, senha)
                        .orElseThrow(() -> new UsuarioNaoEncontradoException("usuário não encontrado")));
    }


}
