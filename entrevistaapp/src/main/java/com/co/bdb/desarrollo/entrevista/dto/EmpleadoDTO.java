package com.co.bdb.desarrollo.entrevista.dto;

public class EmpleadoDTO {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	private String apellido;
	private String correo;
	private Long numeroCelular;
	private boolean activo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Long getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(Long numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "EmpleadoDTO [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", numeroCelular=" + numeroCelular + ", activo=" + activo + "]";
	}
	
	
	
	

}
