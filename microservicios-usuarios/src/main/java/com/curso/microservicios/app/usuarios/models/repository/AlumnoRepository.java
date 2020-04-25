package com.curso.microservicios.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
