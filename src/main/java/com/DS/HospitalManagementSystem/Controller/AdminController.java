package com.DS.HospitalManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.services.AdminServices;
import com.DS.HospitalManagementSystem.services.PatientServices;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private PatientServices patientServices;
	
	@Autowired
	private AdminServices adminService;
	
	@GetMapping
	public String greet()
	{
		return "welcome admin";
	}
	
	@GetMapping("/patientDetails")
	public ResponseEntity<List<Patient>> getPatientDetails()
	{
		return new ResponseEntity<List<Patient>>(patientServices.getPatientDetails(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/registerDoctor")
	public ResponseEntity<String> registerDoctor(@RequestBody DoctorDto doctorDto)
	{
		adminService.registerDoctor(doctorDto);
		return ResponseEntity.ok("Doctor Created Successfully!!");
	}
	
	@PostMapping("/createDepartment")
	public ResponseEntity<String> createDepartment(@RequestBody DepartmentDto departmentDto)
	{
		adminService.createDepartment(departmentDto);
		return ResponseEntity.ok("Department Created Successfully");
	}
	
	
	
}
