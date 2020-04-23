package com.curso.microservicios.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.app.usuarios.models.entity.Alumno;
import com.curso.microservicios.app.usuarios.services.AlumnoService;

@RestController
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> ver(@PathVariable Long id) {
		Optional<Alumno> o = service.findById(id);
		if (!o.isPresent()){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(o.get());
	}

}
