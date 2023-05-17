package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.converter.ContaConverter;
import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.repository.ContaRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ContaService {
    private final ContaRepository contaRepository;

    @Transactional
    public String criarConta(@Valid ContaRequest request) {
        contaRepository.save(ContaConverter.converterParaEntidade(request));

        return "o usuário " + request.nomeDeUsuario() + " teve sua conta criada com sucesso";
    }

    public ContaResponse realizarLogin(String email, String senha) {
        return ContaConverter.converterParaResponse(contaRepository.buscarPorEmailESenha(email, senha));
    }


}
