package br.com.ucsal.manutencao.entity;

import javax.persistence.Entity;

@Entity(name = "gestor")
public class GestorEntity extends UsuarioEntity {

	public String emitirRelatorio() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString() + " GestorEntity []";
	}
	
}
