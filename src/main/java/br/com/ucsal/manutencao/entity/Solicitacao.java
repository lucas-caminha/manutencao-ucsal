package br.com.ucsal.manutencao.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "solicitacao")
public class Solicitacao {

	@Id
	private Integer id;
	private LocalDate dataSolicitacao;
	@ManyToOne
	private Usuario usuario;
	@OneToOne
	private Laboratorio laboratorio;
	@OneToOne
	private Servico servico;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
