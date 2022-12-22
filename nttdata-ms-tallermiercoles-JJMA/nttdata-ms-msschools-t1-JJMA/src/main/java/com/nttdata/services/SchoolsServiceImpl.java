package com.nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.dto.SchoolsDTO;

/**
 * 
 * @author Implementacion del servicio schools
 *
 */
@Service
public class SchoolsServiceImpl implements SchoolsServiceI{

	@Override
	public List<SchoolsDTO> searchAll() {
		
		List<SchoolsDTO> schoolsList = new ArrayList<SchoolsDTO>();
		
		SchoolsDTO school = new SchoolsDTO();
		school.setSchoolId(1L);
		school.setNombre("Instituto Cástulo");
		school.setDireccion("San Cristobal s/n");
		school.setLocalidad("Linares");
		school.setProvincia("Jaén");
		
		SchoolsDTO school1 = new SchoolsDTO();
		school1.setSchoolId(2L);
		school1.setNombre("Instituto Huarte");
		school1.setDireccion("Gran Avenida 4");
		school1.setLocalidad("Linares");
		school1.setProvincia("Jaén");
		
		schoolsList.add(school);
		schoolsList.add(school1);
		
		return schoolsList;
	}

}
