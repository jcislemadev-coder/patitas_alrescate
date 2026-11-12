package com.krakedev.patitas_al_rescate.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.patitas_al_rescate.entidades.Usuario;
import com.krakedev.patitas_al_rescate.services.UsuarioService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	private final UsuarioService usuarioService;
	
	public AuthController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping("/registrar")
	
	public ResponseEntity<?> registrar (@RequestBody Usuario usuario){
		Usuario usuarioRegistrado = usuarioService.registrar(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRegistrado);
	}
}
