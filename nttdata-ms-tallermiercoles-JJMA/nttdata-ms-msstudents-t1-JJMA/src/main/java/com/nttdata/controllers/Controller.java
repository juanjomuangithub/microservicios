package com.nttdata.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.dto.StudentsDTO;
import com.nttdata.services.StudentsServiceI;

@RestController("api")
public class Controller {
	
	@Autowired
	StudentsServiceI studentsServiceI;
	
	@GetMapping("/getStudentsInfo")
	public List<StudentsDTO> sendAppDataInfo() {
		
		List<StudentsDTO> studentsList = studentsServiceI.searchAll();
		
		
		return studentsList;
		
	}
}
