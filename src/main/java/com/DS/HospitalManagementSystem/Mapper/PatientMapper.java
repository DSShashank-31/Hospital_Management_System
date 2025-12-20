package com.DS.HospitalManagementSystem.Mapper;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Entity.User;

public class PatientMapper {

	public static Patient mapToPatient(PatientDto patientDto,User user)
	{
		Patient patient=new Patient();
				patient.setName(patientDto.getName());
				patient.setAge(patientDto.getAge());
				patient.setEmail(patientDto.getEmail());
				patient.setMobile_number(patientDto.getMobile_number());
				
				
		return patient;
	}
	
	public static PatientDto mapToPatientDto(Patient patient)
	{
		PatientDto patientDto=new PatientDto();
		patientDto.setId(patient.getId());
		patientDto.setName(patient.getName());
		patientDto.setAge(patient.getAge());
		patientDto.setEmail(patient.getEmail());
		patientDto.setMobile_number(patient.getMobile_number());
		
		
		
		return patientDto;		
	}
}
