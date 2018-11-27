package com.co.bdb.desarrollo.entrevista.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.co.bdb.desarrollo.entrevista.mapper.EmpleadoMapper;

@Repository
public class EmpleadoDaoImpl implements EmpleadoDao {

	@Autowired
	private EmpleadoMapper empleadoMapper;
	
	public String recuperarMensaje(String usuario) {
		// TODO Auto-generated method stub
		return empleadoMapper.recuperarMensaje(usuario);
	}

}
