package com.drodrigues17.coracaodascartas.repository;

import com.drodrigues17.coracaodascartas.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContaRepository extends JpaRepository<Conta, UUID> {

    @Query("SELECT c FROM Conta c WHERE c.email = :email AND c.senha = :senha")
    Conta buscarPorEmailESenha(String email, String senha);
}
