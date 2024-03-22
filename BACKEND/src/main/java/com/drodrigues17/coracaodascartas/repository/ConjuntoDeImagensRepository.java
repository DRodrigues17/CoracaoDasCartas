package com.drodrigues17.coracaodascartas.repository;

import com.drodrigues17.coracaodascartas.model.ConjuntoDeImagens;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConjuntoDeImagensRepository extends JpaRepository<ConjuntoDeImagens, UUID> {
}
