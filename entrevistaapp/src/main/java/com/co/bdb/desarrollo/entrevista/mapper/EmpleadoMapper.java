package com.co.bdb.desarrollo.entrevista.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmpleadoMapper {
	
	String recuperarMensaje(@Param("nombre") String nombre);
	

}
