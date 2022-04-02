package com.pruebatecnica.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String gusto_musical;

	public Usuario(Integer id, String email, String gusto_musical) {
		super();
		this.id = id;
		this.email = email;
		this.gusto_musical = gusto_musical;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGusto_musical() {
		return gusto_musical;
	}

	public void setGusto_musical(String gusto_musical) {
		this.gusto_musical = gusto_musical;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", gusto_musical=" + gusto_musical + "]";
	}

}
