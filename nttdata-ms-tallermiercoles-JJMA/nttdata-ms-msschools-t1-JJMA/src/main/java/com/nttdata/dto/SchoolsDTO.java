package com.nttdata.dto;

/**
 * 
 * @author Juanjo
 * 
 *         Dto de institutos
 *
 */
public class SchoolsDTO {

	private Long schoolId;
	private String nombre;
	private String direccion;
	private String localidad;
	private String provincia;
	
	public SchoolsDTO(Long schoolId, String nombre, String direccion, String localidad, String provincia) {
		super();
		this.schoolId = schoolId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public SchoolsDTO() {
		super();
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	

}
