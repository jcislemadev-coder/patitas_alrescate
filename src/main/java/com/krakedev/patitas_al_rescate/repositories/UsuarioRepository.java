package com.krakedev.patitas_al_rescate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krakedev.patitas_al_rescate.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	Usuario findByUsername(String name);

}
