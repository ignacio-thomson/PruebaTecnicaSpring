package com.pruebatecnica.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.modelo.Usuario;
import com.pruebatecnica.service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3200)
public class UsuarioController {
	
	@Autowired
	UsuarioService svc;
	
	@GetMapping
	public List<Usuario> listar() {
		return svc.findUsuarios();
	}
	
	@PostMapping
	public Usuario agregar(@RequestBody Usuario usuario) {
		return svc.add(usuario);
	}

}
