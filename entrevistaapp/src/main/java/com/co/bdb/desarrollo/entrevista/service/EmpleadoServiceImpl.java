package com.co.bdb.desarrollo.entrevista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.bdb.desarrollo.entrevista.dao.EmpleadoDao;
import com.co.bdb.desarrollo.entrevista.dto.EmpleadoDTO;



@Service("empleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoDao empleadoDao;

	public EmpleadoDTO getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long createEmpleado(EmpleadoDTO emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmpleadoDTO updateEmplado(EmpleadoDTO emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public String welcome(String nombre) {
		// TODO Auto-generated method stub
		return empleadoDao.recuperarMensaje(nombre);
	}

	

}
