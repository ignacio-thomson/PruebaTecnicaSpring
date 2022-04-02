package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.modelo.Usuario;

public interface UsuarioService {
	
	public List<Usuario> findUsuarios();
	public Usuario add(Usuario usuario);

}
