
package com.DS.HospitalManagementSystem.Mapper;

import org.springframework.stereotype.Component;

import com.DS.HospitalManagementSystem.Dto.DoctorDto;

import com.DS.HospitalManagementSystem.Entity.Department;
import com.DS.HospitalManagementSystem.Entity.Doctor;
import com.DS.HospitalManagementSystem.Entity.User;

@Component
public class DoctorMapper {

	public  Doctor mapToDoctor(DoctorDto doctorDto,User user,Department department)
	{
		Doctor doctor=new Doctor();
		doctor.setName(doctorDto.getName());
		doctor.setSpecialization(doctorDto.getSpecialization());
		doctor.setPhone_number(doctorDto.getPhone_number());
		doctor.setExperience(doctorDto.getExperience());
		doctor.setUser(user);
		doctor.setDepartment(department);
		return doctor;
	}
	
	public DoctorDto mapToDoctorDto(Doctor doctor)
	{
		DoctorDto doctorDto=new DoctorDto();
		doctorDto.setId(doctor.getId());
		doctorDto.setName(doctor.getName());
		doctorDto.setSpecialization(doctor.getSpecialization());
		doctorDto.setPhone_number(doctor.getPhone_number());
		doctorDto.setExperience(doctor.getExperience());
		doctorDto.setDepartmentName(doctor.getDepartment().getName());
		
		return doctorDto;
	}
	
}
