package com.DS.HospitalManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.services.PatientServices;

@Controller
public class PatientController {
	
	@Autowired
	private PatientServices patientService;
	
	@PostMapping("/register")
	public ResponseEntity<PatientDto> registerPatient(@RequestBody PatientDto patientDto)
	{
		return new ResponseEntity<PatientDto>(patientService.registePatient(patientDto),HttpStatus.CREATED);
	}
}
