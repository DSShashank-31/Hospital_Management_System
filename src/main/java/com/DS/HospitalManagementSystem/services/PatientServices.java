package com.DS.HospitalManagementSystem.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Patient;

@Service
public interface PatientServices {

		
		PatientDto registerPatient(PatientDto patientDto);

		
		List<Patient> getPatientDetails();
	

}
