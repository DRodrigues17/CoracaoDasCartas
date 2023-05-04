package br.org.fundatec.heartofcards.service;

import br.org.fundatec.heartofcards.dto.request.ContaRequest;
import br.org.fundatec.heartofcards.dto.response.ContaResponse;
import br.org.fundatec.heartofcards.repository.ContaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    private ContaRepository contaRepository;

    public ContaResponse criarConta(ContaRequest conta){
        return null;
    }


}
