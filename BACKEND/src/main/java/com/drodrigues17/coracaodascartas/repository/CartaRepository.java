package com.drodrigues17.coracaodascartas.repository;


import com.drodrigues17.coracaodascartas.model.carta.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CartaRepository extends JpaRepository<Carta, UUID> {

    @Query("SELECT a FROM Carta a WHERE a.nome = :nome")
    Carta buscarCartaPorNome(String nome);

}
