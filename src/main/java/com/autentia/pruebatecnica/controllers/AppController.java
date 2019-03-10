/**
 * Class created to allow the application to start. Without this class, an error is raised
 */

package com.autentia.pruebatecnica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping("/")
	public String home() {
		return "Working!";
	}

}