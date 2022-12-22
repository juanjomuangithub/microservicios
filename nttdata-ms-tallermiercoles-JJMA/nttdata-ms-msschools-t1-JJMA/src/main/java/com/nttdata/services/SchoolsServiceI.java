package com.nttdata.services;

import java.util.List;

import com.nttdata.dto.SchoolsDTO;

/**
 * 
 * @author Juanjo
 * 
 * Servicio de schools
 *
 */
public interface SchoolsServiceI {

	/**
	 * 
	 * @return Lista de schools
	 */
	public List<SchoolsDTO> searchAll();
}
