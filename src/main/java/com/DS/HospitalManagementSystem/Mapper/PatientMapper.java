package com.DS.HospitalManagementSystem.Mapper;

import org.springframework.stereotype.Component;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Dto.PatientResopnseDto;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Entity.User;

@Component
public class PatientMapper {

	public static Patient mapToPatient(PatientDto patientDto,User user)
	{
		Patient patient=new Patient();
				patient.setName(patientDto.getName());
				patient.setAge(patientDto.getAge());
				patient.setEmail(patientDto.getEmail());
				patient.setMobile_number(patientDto.getMobile_number());
				patient.setUser(user);
				
		return patient;
	}
	
	public static PatientResopnseDto mapToPatientDto(Patient patient)
	{
		PatientResopnseDto patientDto=new PatientResopnseDto();
		patientDto.setId(patient.getId());
		patientDto.setName(patient.getName());
		patientDto.setAge(patient.getAge());
		patientDto.setEmail(patient.getEmail());
		patientDto.setMobile_number(patient.getMobile_number());
		patientDto.setUsername(patient.getUser().getUsername());
		return patientDto;
	}
	
}
