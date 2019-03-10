package com.autentia.pruebatecnica.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.autentia.pruebatecnica.model.Profesor;

/**
 * 
 * This interface is used to map the class Profesor with the table
 * in the database using the MyBatis framework
 * @author Eugenio Salguero
 * @version 0.1
 *
 */

@Mapper
public interface ProfesorMapper {

	@Insert("INSERT INTO profesores(nombre, apellidos) VALUES(#{nombre}, #{apellidos})")
	public int insert(Profesor profesor);
	
	@Select("SELECT id_profesor, nombre, apellidos FROM profesores")
	@Results(value = {
			@Result(property = "id_profesor", column = "id_profesor"),
			@Result(property = "nombre", column = "nombre"),
			@Result(property = "apellidos", column = "apellidos")
		})
	public List<Profesor> getAll();
	
	@Select("SELECT id_profesor, nombre, apellidos FROM profesores WHERE id_profesor = #{id_profesor}")
	@Results(value = {
			@Result(property = "id_profesor", column = "id_profesor"),
			@Result(property = "nombre", column = "nombre"),
			@Result(property = "apellidos", column = "apellidos")
		})
	public Profesor getProfesor(@Param("id_profesor") int id_profesor);
}
