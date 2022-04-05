package br.com.ucsal.manutencao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ucsal.manutencao.dto.UsuarioDTO;
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
	public String login(UsuarioDTO usuarioDTO) {
		System.out.println("user: " + usuarioDTO.getLogin() + " | senha: " + usuarioDTO.getSenha());
		
		UsuarioEntity autenticado = usuarioService.autentica(usuarioDTO);
		if (autenticado != null) {
			return "home";
		}		
		return "login";
	}
	
}
