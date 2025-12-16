package com.DS.HospitalManagementSystem.services;


import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.PatientDto;

@Service
public interface PatientServices {

		PatientDto registePatient(PatientDto patientDto);
	

}
