package com.krakedev.patitas_al_rescate.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krakedev.patitas_al_rescate.entidades.Usuario;
import com.krakedev.patitas_al_rescate.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public Usuario registrar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public boolean autenticar(String username, String password) {
		Usuario usuario = usuarioRepository.findByUsername(username);
		if (usuario == null) {
			return false;
		}
			return usuario.getPassword().equals(password);
	}

}
