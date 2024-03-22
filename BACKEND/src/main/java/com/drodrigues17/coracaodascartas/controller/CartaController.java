package com.drodrigues17.coracaodascartas.controller;

import com.drodrigues17.coracaodascartas.dto.response.CartaResponse;
import com.drodrigues17.coracaodascartas.service.CartaService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/cartas")
@CrossOrigin(origins = "http://localhost:3000")
public class CartaController {

    private final CartaService cartaService;

    @GetMapping
    public ResponseEntity<Page<CartaResponse>> buscarTodasAsCartas() {
        return ResponseEntity.ok(cartaService.buscarCartas());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<CartaResponse> buscarCartaPorNome(@PathVariable("nome") String nome) {
        return ResponseEntity.ok(cartaService.buscarCartaPorNome(nome));
    }
}
