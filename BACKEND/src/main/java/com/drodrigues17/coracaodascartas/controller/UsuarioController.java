package com.drodrigues17.coracaodascartas.controller;

import com.drodrigues17.coracaodascartas.dto.request.UsuarioAutenticacaoRequest;
import com.drodrigues17.coracaodascartas.dto.request.UsuarioRequest;
import com.drodrigues17.coracaodascartas.dto.response.UsuarioResponse;
import com.drodrigues17.coracaodascartas.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity<UsuarioResponse> cadastrar(@RequestBody @Valid UsuarioRequest request) {
        return new ResponseEntity<>(usuarioService.cadastrar(request), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioResponse> autenticar(@RequestBody UsuarioAutenticacaoRequest request) {
        return ResponseEntity.ok(usuarioService.autenticar(request));
    }
}
