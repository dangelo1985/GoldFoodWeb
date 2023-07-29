package br.com.goldfood.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
	
	@PostMapping
	public ResponseEntity<?> salvarUsuario(){
		
		return null;
	}

}
