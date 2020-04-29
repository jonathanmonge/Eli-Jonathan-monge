package com.Covid.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the r_dui database table.
 * 
 */
@Entity
@Table(name="r_dui")
@NamedQuery(name="RDui.findAll", query="SELECT r FROM RDui r")
public class RDui implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuarios;

	private String apellido;

	private String nombre;

	private String numero_Dui;

	public RDui() {
	}

	public int getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero_Dui() {
		return this.numero_Dui;
	}

	public void setNumero_Dui(String numero_Dui) {
		this.numero_Dui = numero_Dui;
	}

}