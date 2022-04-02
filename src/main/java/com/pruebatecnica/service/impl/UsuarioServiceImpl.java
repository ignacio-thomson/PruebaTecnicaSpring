package com.pruebatecnica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnica.dao.UsuarioRepository;
import com.pruebatecnica.modelo.Usuario;
import com.pruebatecnica.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository dao;
	
	@Override
	public List<Usuario> findUsuarios() {
		return dao.findAll();
	}

	@Override
	public Usuario add(Usuario usuario) {
		return dao.save(usuario);
	}

}
