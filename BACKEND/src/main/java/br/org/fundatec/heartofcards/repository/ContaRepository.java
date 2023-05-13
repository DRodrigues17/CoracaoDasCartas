package br.org.fundatec.heartofcards.repository;

import br.org.fundatec.heartofcards.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContaRepository extends JpaRepository<Conta, UUID> {

    @Query("SELECT a FROM Conta a WHERE a.email = :email")
    Conta buscarPorEmail(String email);
}
