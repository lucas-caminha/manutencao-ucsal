package br.com.ucsal.manutencao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ucsal.manutencao.dto.UsuarioDTO;
import br.com.ucsal.manutencao.entity.GestorEntity;
import br.com.ucsal.manutencao.entity.SolicitanteEntity;
import br.com.ucsal.manutencao.entity.UsuarioEntity;
import br.com.ucsal.manutencao.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping
	public String loginHome(HttpServletRequest req) {
		req.removeAttribute("notificacao");
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(UsuarioDTO usuarioDTO, HttpSession session) {		
		UsuarioEntity autenticado = usuarioService.autentica(usuarioDTO);
				
		if (autenticado instanceof GestorEntity) {
			session.setAttribute("gestor", autenticado);
		}
		
		if (autenticado instanceof SolicitanteEntity) {
			session.setAttribute("solicitante", autenticado);
		}
		
		return "home";
	}
	
	@RequestMapping("/logoff")
	public String logoff(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
}
