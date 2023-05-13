package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.converter.ContaConverter;
import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.repository.ContaRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContaService {
    private ContaRepository contaRepository;

    @Transactional
    public String criarConta(@Valid ContaRequest request) {
        contaRepository.save(ContaConverter.converterParaEntidade(request));

        return "o usuário " + request.nomeDeUsuario() + " teve sua conta criada com sucesso";
    }

    public ContaResponse buscarContaPorEmailESenha( String email, String senha){

        ContaResponse response = ContaConverter.converterParaResponse(contaRepository.buscarPorEmailESenha(email,senha));

        return new ContaResponse( response.nomeDeUsuario());
    }


}
