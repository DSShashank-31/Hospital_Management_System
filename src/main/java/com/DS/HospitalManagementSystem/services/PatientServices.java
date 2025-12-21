package com.DS.HospitalManagementSystem.services;


import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.PatientDto;

@Service
public interface PatientServices {

		
		PatientDto registerPatient(PatientDto patientDto);
	

}
