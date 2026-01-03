package com.DS.HospitalManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;
import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Appoitment;
import com.DS.HospitalManagementSystem.services.AppoitmentService;
import com.DS.HospitalManagementSystem.services.PatientServices;

@RestController
@RequestMapping("/patient")
//@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {
	
	@Autowired
	private PatientServices patientService;
	
	@Autowired
	private AppoitmentService appoitmentService;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerPatient(@RequestBody PatientDto patientDto)
	{
		patientService.registerPatient(patientDto);
		return ResponseEntity.ok("Patient Registered Successfully");
	}
	
	@GetMapping("/dashboard")
	public ResponseEntity<String> dashboard()
	{
		return ResponseEntity.ok("welcome patient");
	}
	
	@PostMapping("/book")
	public ResponseEntity<String> bookAppoitment(@RequestBody AppoitmentDto appoitmentDto)
	{
		appoitmentService.bookAppoitment(appoitmentDto);
		return ResponseEntity.ok("appointment booked");
	}
}
