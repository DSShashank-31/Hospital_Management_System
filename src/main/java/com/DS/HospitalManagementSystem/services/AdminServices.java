package com.DS.HospitalManagementSystem.services;

import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;

@Service
public interface AdminServices {

	void registerDoctor(DoctorDto doctorDto);
	
	void createDepartment(DepartmentDto departmentDto);
	
}
