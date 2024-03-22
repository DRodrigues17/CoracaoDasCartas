package com.drodrigues17.coracaodascartas.repository;

import com.drodrigues17.coracaodascartas.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DeckRepository extends JpaRepository<Deck, UUID> {

  Optional<Deck> findByNomme(String nomeDoDeck);
}
