package br.com.ucsal.manutencao.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsuarioDTO {
	
	@NotBlank
	private String login;
	@NotBlank
	@Size(min = 6, max = 18)
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
