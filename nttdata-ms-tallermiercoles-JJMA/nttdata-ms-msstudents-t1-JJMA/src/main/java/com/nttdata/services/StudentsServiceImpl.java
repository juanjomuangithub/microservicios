package com.nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.dto.StudentsDTO;

@Service
public class StudentsServiceImpl implements StudentsServiceI{

	@Override
	public List<StudentsDTO> searchAll() {
		
		List<StudentsDTO> studentsList = new ArrayList<StudentsDTO>();
		
		StudentsDTO student = new StudentsDTO();
		student.setAlumnoId(1L);
		student.setNombre("Juanjo");
		student.setPrimerApellido("Munoz");
		student.setSegundoApellido("Ansotegui");
		student.setDNI("346346346g");
		
		StudentsDTO student2 = new StudentsDTO();
		student2.setAlumnoId(2L);
		student2.setNombre("Pepito");
		student2.setPrimerApellido("Linares");
		student2.setSegundoApellido("Jaen");
		student2.setDNI("34634656k");
		
		studentsList.add(student);
		studentsList.add(student2);
		
		
		return studentsList;
	}

}
