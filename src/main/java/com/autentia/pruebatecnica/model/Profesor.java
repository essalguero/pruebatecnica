package com.autentia.pruebatecnica.model;

import java.io.Serializable;


/**
 * This class is defined in the Problem model. The database will keep information
 * of teachers (Profesores) in an independent table
 * 
 * @author Eugenio Salguero
 * @version 0.1
 */

public class Profesor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id_profesor;
	private String nombre;
	private String apellidos;

	public Profesor() {
		
	}
	
	// Getters and Setters
	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * 
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * @return
	 */
	public int getId_profesor() {
		return id_profesor;
	}
}
