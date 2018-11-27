package com.co.bdb.desarrollo.entrevista.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.co.bdb.desarrollo.entrevista.service.EmpleadoService;




@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	private static final Logger LOG = LoggerFactory.getLogger("msbanco");
	
	@Autowired
	private EmpleadoService empleadoService;
	

////	@CrossOrigin(origins = "*")
//	@RequestMapping(value = "/create", method = RequestMethod.PUT, consumes = { MediaType.APPLICATION_JSON_VALUE,
//			MediaType.APPLICATION_JSON_UTF8_VALUE })
//	public ResponseEntity<GeneralResponse<Long>> createEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
//
//		HttpStatus status = HttpStatus.OK;
//		GeneralResponse<Long> response = new GeneralResponse<Long>();
//
//		LOG.info("Inicio - crearEmpleado", empleadoDTO);
//
//		try {
//			Long id = empleadoService.createEmpleado(empleadoDTO);
//			response.setData(id);
//			response.setSuccess(true);
//			response.setMessage("Empleado actualizado exitosamente");
//
//		}catch (Exception ex) {
//			LOG.error(ex.getMessage(), ex);
//			response.setApiError(new ApiError("Ha ocurrido un error interno, favor comunicarse con el administrador",ex.getMessage(),"505"));
//			response.setSuccess(false);
//			status = HttpStatus.INTERNAL_SERVER_ERROR;
//
//		}
//
//		LOG.info("Fin - Crear empleado");
//
//		return new ResponseEntity<GeneralResponse<Long>>(response, status);
//
//	}
//	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/test/{usuario}", method = RequestMethod.GET)
	 public String welcome(@PathVariable("usuario") String userName
	    ) 
	    {
	        return empleadoService.welcome(userName);
	    }
}
