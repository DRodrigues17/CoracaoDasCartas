package br.org.fundatec.heartofcards.repository;

import br.org.fundatec.heartofcards.model.Deck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeckRepository extends CrudRepository<Deck, UUID> {
}