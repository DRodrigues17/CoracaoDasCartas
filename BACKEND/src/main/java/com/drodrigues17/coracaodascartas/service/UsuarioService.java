package com.drodrigues17.coracaodascartas.service;

import com.drodrigues17.coracaodascartas.dto.mapper.UsuarioMapper;
import com.drodrigues17.coracaodascartas.dto.request.UsuarioAutenticacaoRequest;
import com.drodrigues17.coracaodascartas.dto.request.UsuarioRequest;
import com.drodrigues17.coracaodascartas.dto.response.UsuarioResponse;
import com.drodrigues17.coracaodascartas.repository.UsuarioRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Transactional
    public UsuarioResponse cadastrar(@Valid UsuarioRequest request) {

        var usuario = UsuarioMapper.converterParaEntidade(request);

        usuario.setSenha(passwordEncoder.encode(request.senha()));

        return UsuarioMapper.converterParaResponse(usuarioRepository.save(usuario), jwtService.gerarToken(usuario));
    }

    public UsuarioResponse autenticar(UsuarioAutenticacaoRequest request) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.email(), request.senha()));

        var usuario = usuarioRepository.findByEmail(request.email()).orElseThrow();

        return UsuarioMapper.converterParaResponse(usuario, jwtService.gerarToken(usuario));
    }


}
