package com.autentia.pruebatecnica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.autentia.pruebatecnica.mappers.ProfesorMapper;
import com.autentia.pruebatecnica.model.Profesor;

@Service
public class ProfesorService {

	private ProfesorMapper profesorMapper;
	
	public ProfesorService(ProfesorMapper profesorMapper) {
		this.profesorMapper = profesorMapper;
	}
	
	public Profesor create(Profesor profesor) {
		profesorMapper.insert(profesor);
		return profesor;
	}
	public List<Profesor> findAll() {
		return profesorMapper.getAll();
	}
	
	public Profesor find(int id_profesor) {
		return profesorMapper.getProfesor(id_profesor);
	}
}
