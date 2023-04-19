package br.org.fundatec.heartofcards.repository;

import br.org.fundatec.heartofcards.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CardRepository extends CrudRepository<Card, UUID> {
}
