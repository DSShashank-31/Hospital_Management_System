package com.DS.HospitalManagementSystem.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Mapper.PatientMapper;
import com.DS.HospitalManagementSystem.Repository.PatientRepo;
import com.DS.HospitalManagementSystem.services.PatientServices;

@Service
public class PatientServicesImp implements PatientServices{

	@Autowired
	private PatientRepo patientRepo;

	@Override
	public PatientDto registePatient(PatientDto patientDto) {
		Patient patient=PatientMapper.mapToPatient(patientDto);
		Patient savedPatient=patientRepo.save(patient);
		return PatientMapper.mapToPatientDto(savedPatient);
	}
}
