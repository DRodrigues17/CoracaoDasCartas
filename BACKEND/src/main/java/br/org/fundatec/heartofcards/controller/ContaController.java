package br.org.fundatec.heartofcards.controller;

import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.service.ContaService;
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

    @GetMapping("/{email}/{senha}")
    public ResponseEntity<ContaResponse> realizarLogin(@PathVariable("email") String email, @PathVariable("senha") String senha) {
        return ResponseEntity.ok(contaService.realizarLogin(email, senha));
    }

    @PostMapping
    public ResponseEntity<String> criarConta(@RequestBody @Valid ContaRequest request) {
        contaService.criarConta(request);
        return new ResponseEntity<>(contaService.criarConta(request), HttpStatus.CREATED);
    }
}
