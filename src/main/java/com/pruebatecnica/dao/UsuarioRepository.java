package com.pruebatecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebatecnica.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
