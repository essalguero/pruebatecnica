package com.autentia.pruebatecnica.model;

import java.io.Serializable;

/**
 * This class is defined in the Problem model. The database will keep information
 * of courses (Cursos) in an independent table
 * 
 * @author Eugenio Salguero
 * @version 0.1
 */

public class Curso implements Serializable {
	
	private int id_curso;
	private String titulo;
	private String nivel;
	private int num_horas;
	private boolean activo;
	private int id_profesor;
	
	public Curso() {
		
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getNum_horas() {
		return num_horas;
	}

	public void setNum_horas(int num_horas) {
		this.num_horas = num_horas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}

	public int getId_curso() {
		return id_curso;
	}
}
