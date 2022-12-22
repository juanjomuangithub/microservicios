package com.nttdata.dto;

/**
 * 
 * @author Juanjo
 * 
 *         Dto de estudiantes
 *
 */
public class StudentsDTO {

	private Long alumnoId;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String DNI;

	public StudentsDTO(Long alumnoId, String nombre, String primerApellido, String segundoApellido, String DNI) {
		super();
		this.alumnoId = alumnoId;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.DNI = DNI;
	}

	public StudentsDTO() {
		super();
	}

	public Long getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

}
