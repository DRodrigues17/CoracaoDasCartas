package com.drodrigues17.coracaodascartas.controller;

import com.drodrigues17.coracaodascartas.dto.request.ContaRequest;
import com.drodrigues17.coracaodascartas.dto.response.ContaResponse;
import com.drodrigues17.coracaodascartas.service.ContaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/contas")
@CrossOrigin(origins = "http://localhost:3000")
public class ContaController {

    private final ContaService contaService;

    @GetMapping("/login/{email}/{senha}")
    public ResponseEntity<ContaResponse> realizarLogin(@PathVariable("email") String email, @PathVariable("senha") String senha) {
        return ResponseEntity.ok(contaService.realizarLogin(email, senha));
    }

    @PostMapping("/cadastro")
    public ResponseEntity<String> criarConta(@RequestBody @Valid ContaRequest request) {
        return new ResponseEntity<>(contaService.criarConta(request), HttpStatus.CREATED);
    }
}
