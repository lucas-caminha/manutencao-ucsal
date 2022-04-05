package br.com.ucsal.manutencao.exception;

public class CredenciaisNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CredenciaisNotFoundException(String msg) {
		super(msg);
	}
}
