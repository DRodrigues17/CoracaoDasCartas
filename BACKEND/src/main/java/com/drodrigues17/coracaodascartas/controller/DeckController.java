package com.drodrigues17.coracaodascartas.controller;

import com.drodrigues17.coracaodascartas.dto.response.DeckResponse;
import com.drodrigues17.coracaodascartas.service.DeckService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/decks")
public class DeckController {

    private final DeckService deckService;

    @GetMapping
    public ResponseEntity<List<DeckResponse>> buscarTodosDecks() {
        return ResponseEntity.ok(deckService.buscarTodosDecks());
    }

    @GetMapping("/{nome}")
    public ResponseEntity<DeckResponse> buscarDeckPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(deckService.buscarDeckPorNome(nome));
    }

}
