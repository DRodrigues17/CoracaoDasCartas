package com.drodrigues17.coracaodascartas.repository;

import com.drodrigues17.coracaodascartas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    @Query("SELECT c FROM Usuario c WHERE c.email = :email AND c.senha = :senha")
    Optional<Usuario> buscarPorEmailESenha(String email, String senha);
}
