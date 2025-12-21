package com.DS.HospitalManagementSystem.services.imp;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Entity.User;
import com.DS.HospitalManagementSystem.Mapper.PatientMapper;
import com.DS.HospitalManagementSystem.Repository.PatientRepo;
import com.DS.HospitalManagementSystem.Repository.UserRepo;
import com.DS.HospitalManagementSystem.services.PatientServices;

@Service
public class PatientServicesImp implements PatientServices{

	@Autowired
	private PatientRepo patientRepo;
	
	
	
	
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public PatientDto registerPatient(PatientDto patientDto) {
		if(!patientDto.getPassword().equals(patientDto.getConfirmPassword()))
		{
			throw new RuntimeException("passwords do not match");
		}
		
		User user=new User();
		user.setUsername(patientDto.getUsername());
		user.setPassword(patientDto.getPassword());
		
		userRepo.save(user);
		
		
		Patient patient=PatientMapper.mapToPatient(patientDto,user);
		Patient savedPatient=patientRepo.save(patient);
		return PatientMapper.mapToPatientDto(savedPatient);
	}
}
