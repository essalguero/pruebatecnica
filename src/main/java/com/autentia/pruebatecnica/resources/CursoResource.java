package com.autentia.pruebatecnica.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.autentia.pruebatecnica.model.Curso;
import com.autentia.pruebatecnica.model.Profesor;
import com.autentia.pruebatecnica.services.CursoService;

/**
 * 
 * Servicio REST para trabajar con Cursos
 * 
 * @author Eugenio Salguero
 * @version 0.1
 *
 */

@Component
@Path("/cursos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CursoResource {
	
	private CursoService cursoService;
	
	public CursoResource(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
	@GET
	public Response getAll() {
		Response response = Response.ok().entity(cursoService.findAll()).build();
		
		//System.out.println("Returning response for getAll");
		
		return response;
		
	}
	
	@GET
	@Path("/{id_curso}")
	public Response get(@PathParam("id_curso") int id_curso) {
		Curso curso;
		
		curso =  cursoService.find(id_curso);
		
		Response response = Response.ok().entity(curso).build();
		
		//System.out.println("Returning response for Curso: " + id_curso);
		
		return response;
	}
	
	@POST
	public Response create(Curso curso) {
		if (curso.getTitulo() == null || curso.getNivel() == null)
			return Response.status(500).entity("El curso no esta completo").build();
		else
			if ("".equals(curso.getTitulo()) || "".equals(curso.getNivel()) || 
					curso.getNum_horas() == 0 || curso.getId_profesor() == 0)
				return Response.status(501).entity("Algún campo del curso está en blanco").build();
		return Response.ok().entity(cursoService.create(curso)).build();
	}
}
