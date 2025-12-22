package com.DS.HospitalManagementSystem.services;

import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;

@Service
public interface AdminServices {

	DoctorDto registerDoctor(DoctorDto doctorDto);
	
	DepartmentDto createDepartment(DepartmentDto departmentDto);
	
}
