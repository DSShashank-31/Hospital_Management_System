package com.DS.HospitalManagementSystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;
import com.DS.HospitalManagementSystem.Dto.PatientResopnseDto;

@Service
public interface AdminServices {

	void registerDoctor(DoctorDto doctorDto);
	
	void createDepartment(DepartmentDto departmentDto);
	
	List<PatientResopnseDto> getAllPatients();
	
}
