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
import com.DS.HospitalManagementSystem.Dto.DepartmentResponseDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;
import com.DS.HospitalManagementSystem.Dto.DoctorResponseDto;
import com.DS.HospitalManagementSystem.Dto.PatientResopnseDto;
import com.DS.HospitalManagementSystem.services.AdminServices;
import com.DS.HospitalManagementSystem.services.PatientServices;

@RestController
@RequestMapping("/admin")
public class AdminController {


	
	@Autowired
	private AdminServices adminService;
	
	@GetMapping
	public String greet()
	{
		return "welcome admin";
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
	
	@GetMapping("/patients")
	public ResponseEntity<List<PatientResopnseDto>> getAllPatients()
	{
		return new ResponseEntity<List<PatientResopnseDto>>(adminService.getAllPatients(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/doctors")
	public ResponseEntity<List<DoctorResponseDto>> getAllDoctors()
	{
		return new ResponseEntity<List<DoctorResponseDto>>(adminService.getAllDoctors(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/departments")
	public ResponseEntity<List<DepartmentResponseDto>> getAllDepartments()
	{
		return new ResponseEntity<List<DepartmentResponseDto>>(adminService.getAllDepartments(),HttpStatus.ACCEPTED);
	}
	
	
	
}
