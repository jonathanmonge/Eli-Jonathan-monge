package com.Covid.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the r_administrador database table.
 * 
 */
@Entity
@Table(name="r_administrador")
@NamedQuery(name="RAdministrador.findAll", query="SELECT r FROM RAdministrador r")
public class RAdministrador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuarios;

	private String contrasenia;

	private String nombre_usuario;

	private String usuario;

	public RAdministrador() {
	}

	public int getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getNombre_usuario() {
		return this.nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}