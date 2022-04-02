package com.pruebatecnica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pruebatecnica.dao.UsuarioRepository;
import com.pruebatecnica.modelo.Usuario;
import com.pruebatecnica.service.impl.UsuarioServiceImpl;

@SpringBootTest
class TestPruebaTecnica {
	
	@Autowired
	private UsuarioRepository dao;
	
	@Autowired
	private UsuarioServiceImpl svc;

	@Test
	public void validarMetodoFindAll() {
		
		assertNotNull(dao.findAll());
		
	}
	
	@Test
	public void validarMetodoSave() {
		
		Usuario usuario = new Usuario(null, "ignacio.thomson.97@gmail.com", "Rock");	
		assertNotNull(dao.save(usuario));
		
	}

}
