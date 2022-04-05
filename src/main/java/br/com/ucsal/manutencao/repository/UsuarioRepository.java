package br.com.ucsal.manutencao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ucsal.manutencao.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>{

	Optional<UsuarioEntity> findByLogin(String login);

	Optional<UsuarioEntity> findByLoginAndSenha(String login, String senha);
}

/**
 * Funciona como consulta polimorfica, trazendo dados de Gestor e Solicitante.
 */