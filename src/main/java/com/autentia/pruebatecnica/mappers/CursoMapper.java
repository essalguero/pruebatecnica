package com.autentia.pruebatecnica.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.autentia.pruebatecnica.model.Curso;

/**
 * 
 * This interface is used to map the class Curso with the table
 * in the database using the MyBatis framework
 * @author Eugenio Salguero
 * @version 0.1
 *
 */

@Mapper
public interface CursoMapper {
	
	@Insert("INSERT INTO cursos(titulo, nivel, num_horas, activo, id_profesor) VALUES(#{titulo}, #{nivel}, #{num_horas}, #{activo}, #{id_profesor})")
	public int insert(Curso curso);
	
	@Select("SELECT id_curso, titulo, nivel, num_horas, activo, id_profesor FROM cursos")
	@Results(value = {
			@Result(property = "id_curso", column = "id_curso"),
			@Result(property = "titulo", column = "titulo"),
			@Result(property = "num_horas", column = "num_horas"),
			@Result(property = "activo", column = "activo"),
			@Result(property = "id_profesor", column = "id_profesor")
		})
	public List<Curso> getAll();
	
	@Select("SELECT id_curso, titulo, nivel, num_horas, activo, id_profesor FROM cursos WHERE id_curso = #{id_curso}")
	@Results(value = {
			@Result(property = "id_curso", column = "id_curso"),
			@Result(property = "titulo", column = "titulo"),
			@Result(property = "num_horas", column = "num_horas"),
			@Result(property = "activo", column = "activo"),
			@Result(property = "id_profesor", column = "id_profesor")
		})
	public Curso getCurso(@Param("id_curso") int id_curso);

}
