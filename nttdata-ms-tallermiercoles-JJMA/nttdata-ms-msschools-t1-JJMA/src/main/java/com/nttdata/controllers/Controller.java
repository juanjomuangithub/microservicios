package com.nttdata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.dto.SchoolsDTO;
import com.nttdata.services.SchoolsServiceI;

/**
 * 
 * @author Juanjo
 * 
 * Controlador de la aplicacion
 *
 */
@RestController("api")
public class Controller {
	
	@Autowired
	SchoolsServiceI schoolServiceI;
	
	@GetMapping("/getSchoolsInfo")
	public List<SchoolsDTO> sendAppDataInfo() {
		
		List<SchoolsDTO> schoolsList = schoolServiceI.searchAll();
		
		
		return schoolsList;
		
	}
}
