package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;

@Entity(name = "gestor")
public class Gestor extends Usuario {

	public String emitirRelatorio() {
		return null;
	}
	
}
