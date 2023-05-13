package br.org.fundatec.heartofcards.repository;

import br.org.fundatec.heartofcards.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContaRepository extends JpaRepository<Conta, UUID> {

    @Query("SELECT FROM conta where email = email and senha = senha")
    Conta buscarPorEmailESenha(String email, String senha);
}
