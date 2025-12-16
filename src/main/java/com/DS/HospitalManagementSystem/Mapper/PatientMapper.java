package com.DS.HospitalManagementSystem.Mapper;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Patient;

public class PatientMapper {

	public static Patient mapToPatient(PatientDto patientDto)
	{
		Patient patient=new Patient(
				patientDto.getId(),
				patientDto.getName(),
				patientDto.getAge(),
				patientDto.getEmail(),
				patientDto.getMobile_number()
				);
		return patient;
	}
	
	public static PatientDto mapToPatientDto(Patient patient)
	{
		PatientDto patientDto=new PatientDto(
				patient.getId(),
				patient.getName(),
				patient.getAge(),
				patient.getEmail(),
				patient.getMobile_number()
				);
		return patientDto;		
	}
}
