package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;

@Entity(name = "solicitante")
public class Solicitante extends Usuario {

	private TipoDeUsuario tipoUsuario;
	
	public Solicitante () {
	}

	public TipoDeUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoDeUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
