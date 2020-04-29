package com.jonathan.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the r_usuario database table.
 * 
 */
@Entity
@Table(name="r_usuario")
@NamedQuery(name="RUsuario.findAll", query="SELECT r FROM RUsuario r")
public class RUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuarios;

	private String contra;

	private String nombre_usuario;

	private String usuario;

	//bi-directional many-to-one association to TbHistorial
	@OneToMany(mappedBy="RUsuario")
	private List<TbHistorial> tbHistorials;

	public RUsuario() {
	}

	public int getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getContra() {
		return this.contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
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

	public List<TbHistorial> getTbHistorials() {
		return this.tbHistorials;
	}

	public void setTbHistorials(List<TbHistorial> tbHistorials) {
		this.tbHistorials = tbHistorials;
	}

	public TbHistorial addTbHistorial(TbHistorial tbHistorial) {
		getTbHistorials().add(tbHistorial);
		tbHistorial.setRUsuario(this);

		return tbHistorial;
	}

	public TbHistorial removeTbHistorial(TbHistorial tbHistorial) {
		getTbHistorials().remove(tbHistorial);
		tbHistorial.setRUsuario(null);

		return tbHistorial;
	}

}