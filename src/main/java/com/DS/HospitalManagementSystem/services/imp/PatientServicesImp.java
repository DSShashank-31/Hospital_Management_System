package com.DS.HospitalManagementSystem.services.imp;



import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.PatientDto;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Entity.Role;
import com.DS.HospitalManagementSystem.Entity.User;
import com.DS.HospitalManagementSystem.Mapper.PatientMapper;
import com.DS.HospitalManagementSystem.Repository.PatientRepo;
import com.DS.HospitalManagementSystem.Repository.RoleRepository;
import com.DS.HospitalManagementSystem.Repository.UserRepo;
import com.DS.HospitalManagementSystem.services.PatientServices;

@Service
public class PatientServicesImp implements PatientServices{

	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public PatientDto registePatient(PatientDto patientDto) {
		if(!patientDto.getPassword().equals(patientDto.getConfirmPassword()))
		{
			throw new RuntimeException("passwords do not match");
		}
		
		Role role=roleRepo.findByName("ROLE_PATIENT").orElseThrow(()-> new RuntimeException("ROlE_Patient not match"));
		User user=new User();
		user.setUsername(patientDto.getUsername());
		user.setPassword(patientDto.getPassword());
		user.setRoles(Set.of(role));
		userRepo.save(user);
		
		
		Patient patient=PatientMapper.mapToPatient(patientDto,user);
		Patient savedPatient=patientRepo.save(patient);
		return PatientMapper.mapToPatientDto(savedPatient);
	}
}
