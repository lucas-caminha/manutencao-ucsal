package br.com.ucsal.manutencao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ucsal.manutencao.dto.UsuarioDTO;
import br.com.ucsal.manutencao.entity.UsuarioEntity;
import br.com.ucsal.manutencao.exception.CredenciaisNotFoundException;
import br.com.ucsal.manutencao.exception.UsuarioNotFoundException;
import br.com.ucsal.manutencao.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioEntity autentica(UsuarioDTO usuarioDTO) {
		
		Optional<UsuarioEntity> usuario = usuarioRepository.findByLogin(usuarioDTO.getLogin());
	
		if (!usuario.isPresent()) {
			throw new UsuarioNotFoundException("Usuario não existe.");
		}
		
		Optional<UsuarioEntity> usuarioAuth = usuarioRepository.findByLoginAndSenha(usuarioDTO.getLogin(), usuarioDTO.getSenha());
		
		if (!usuarioAuth.isPresent()) {
			throw new CredenciaisNotFoundException("Login ou senha inválidos");
		}
		
		return usuarioAuth.get();
	}

}
