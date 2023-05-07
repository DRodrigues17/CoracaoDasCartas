package br.org.fundatec.heartofcards.repository;

import br.org.fundatec.heartofcards.model.ConjuntoDeImagens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConjuntoDeImagensRepository extends JpaRepository<ConjuntoDeImagens, UUID> {
}
