package br.com.ucsal.manutencao.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.ucsal.manutencao.exception.CredenciaisNotFoundException;
import br.com.ucsal.manutencao.exception.UsuarioNotFoundException;

@ControllerAdvice
public class GlobalControllerExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UsuarioNotFoundException.class)
	public String usuarioNotFoundExceptionHandler(HttpServletRequest req, UsuarioNotFoundException e) {
		req.setAttribute("notificacao", e.getMessage());
		return "login";
	}
	
	@ExceptionHandler(CredenciaisNotFoundException.class)
	public String credenciaisNotFoundExceptionHandler(HttpServletRequest req, CredenciaisNotFoundException e) {
		req.setAttribute("notificacao", e.getMessage());
		return "login";
	}
	
	
}
