package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;

@Entity(name = "solicitante")
public class SolicitanteEntity extends UsuarioEntity {

	private TipoDeUsuario tipoUsuario;
	
	public SolicitanteEntity () {
	}

	public TipoDeUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoDeUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}