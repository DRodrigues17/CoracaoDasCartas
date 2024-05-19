package com.drodrigues17.coracaodascartas.controller;

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

    @GetMapping("/login/{email}/{senha}")
    public ResponseEntity<UsuarioResponse> realizarLogin(@PathVariable("email") String email, @PathVariable("senha") String senha) {
        return ResponseEntity.ok(usuarioService.realizarLogin(email, senha));
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> criarConta(@RequestBody @Valid UsuarioRequest request) {
        return new ResponseEntity<>(usuarioService.criarConta(request), HttpStatus.CREATED);
    }
}
