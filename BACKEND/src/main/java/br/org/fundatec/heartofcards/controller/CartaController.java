package br.org.fundatec.heartofcards.controller;

import br.org.fundatec.heartofcards.dto.response.CartaResponse;
import br.org.fundatec.heartofcards.service.CartaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/cartas")
@CrossOrigin(origins = "http://localhost:3000")
public class CartaController {

    @Autowired
    private final CartaService cartaService;

    @GetMapping
    public ResponseEntity<Page<CartaResponse>> buscarTodasAsCartas() {
        return ResponseEntity.ok(cartaService.buscarCartas());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<CartaResponse> buscarCartaPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(cartaService.buscarCartaPorNome(nome));
    }
}
