package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "servico")
public class ServicoEntity {

	@Id
	private Integer id;
	private String problema;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	
}
