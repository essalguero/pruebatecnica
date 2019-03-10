package com.autentia.pruebatecnica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.autentia.pruebatecnica.mappers.CursoMapper;
import com.autentia.pruebatecnica.model.Curso;

@Service
public class CursoService {

	private CursoMapper cursoMapper;
	
	public CursoService(CursoMapper cursoMapper) {
		this.cursoMapper = cursoMapper;
	}
	
	public Curso create(Curso curso) {
		cursoMapper.insert(curso);
		return curso;
	}
	public List<Curso> findAll() {
		return cursoMapper.getAll();
	}
	
	public Curso find(int id_curso) {
		return cursoMapper.getCurso(id_curso);
	}
}
