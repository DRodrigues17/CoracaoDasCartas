package br.org.fundatec.heartofcards.controller;

import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.service.ContaService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

    private ContaService contaService;

    @GetMapping("/{email}/{senha}")
    public ResponseEntity<ContaResponse> buscarContaPorEmailESenha(@PathParam("email") String email, @PathParam("senha") String senha){
        return ResponseEntity.ok(contaService.buscarContaPorEmailESenha(email, senha));
    }

    @PostMapping
    public ResponseEntity<String> criarConta(@RequestBody ContaRequest request){
        contaService.criarConta(request);
        return ResponseEntity.ok(contaService.criarConta(request));
    }
}
