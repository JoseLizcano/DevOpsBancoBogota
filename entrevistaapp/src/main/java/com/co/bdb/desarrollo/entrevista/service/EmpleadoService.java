package com.co.bdb.desarrollo.entrevista.service;

import org.springframework.transaction.annotation.Transactional;

import com.co.bdb.desarrollo.entrevista.dto.EmpleadoDTO;

public interface EmpleadoService {
	
	EmpleadoDTO getEmployeeById(long id);
	
	
	Long createEmpleado(EmpleadoDTO emp);
	
	EmpleadoDTO updateEmplado(EmpleadoDTO emp);
	
	String welcome(String nombre);
	
	
}
