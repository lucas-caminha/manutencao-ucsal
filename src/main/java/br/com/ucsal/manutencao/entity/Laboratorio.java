package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "laboratorio")
public class Laboratorio {

	@Id
	private Integer id;
	private String localizacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
}
