package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "usuario")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UsuarioEntity {
	
	@Id
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	
	public UsuarioEntity(Integer id, String nome, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	public UsuarioEntity() {	
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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

/**
 * Utilizado estratégia Table per Class
 * https://thorben-janssen.com/complete-guide-inheritance-strategies-jpa-hibernate/
 **/
