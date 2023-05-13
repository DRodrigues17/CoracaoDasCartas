package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.converter.ContaConverter;
import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.exception.ContaNaoEncontradaException;
import br.org.fundatec.heartofcards.exception.SenhaInvalidaException;
import br.org.fundatec.heartofcards.repository.ContaRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ContaService {
    private ContaRepository contaRepository;

    @Transactional
    public String criarConta(@Valid ContaRequest request) {
        contaRepository.save(ContaConverter.converterParaEntidade(request));

        return "o usuário " + request.nomeDeUsuario() + " teve sua conta criada com sucesso";
    }

    public ContaResponse realizarLogin(String email, String senha){
        if (!contaRepository.findAll().contains(email)){
            throw new ContaNaoEncontradaException(email);
        } else if (!contaRepository.buscarPorEmail(email).getSenha().equals(senha)){
            throw new SenhaInvalidaException(senha);
        }

        ContaResponse response = ContaConverter.converterParaResponse(contaRepository.buscarPorEmail(email));


        return new ContaResponse( response.nomeDeUsuario());
    }


}
