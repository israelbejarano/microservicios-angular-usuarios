package com.curso.microservicios.app.usuarios.services;


import org.springframework.stereotype.Service;

import com.curso.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.curso.microservicios.commons.alumnos.models.entity.Alumno;
import com.curso.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {


}
