package com.autentia.pruebatecnica.resources;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.springframework.stereotype.Component;

import com.autentia.pruebatecnica.model.Profesor;
import com.autentia.pruebatecnica.services.ProfesorService;

/**
 * 
 * Servicio REST para trabajar con Profesores
 * 
 * @author Eugenio Salguero
 * @version 0.1
 *
 */

@Component
@Path("/profesores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfesorResource {
	
	private ProfesorService profesorService;
	
	public ProfesorResource(ProfesorService profesorService) {
		this.profesorService = profesorService;
	}
	
	@GET
	public Response getAll() {
		Response response = Response.ok().entity(profesorService.findAll()).build();
		
		System.out.println("Returning response for getAll");
		
		return response;
		
	}
	
	@GET
	@Path("/{id_profesor}")
	public Response get(@PathParam("id_profesor") int id_profesor) {
		Profesor profesor;
		
		profesor =  profesorService.find(id_profesor);
		
		Response response = Response.ok().entity(profesor).build();
		
		System.out.println("Returning response for Profesor: " + id_profesor);
		
		return response;
	}
}
