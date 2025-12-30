package com.DS.HospitalManagementSystem.services.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;
import com.DS.HospitalManagementSystem.Entity.Appoitment;
import com.DS.HospitalManagementSystem.Entity.Doctor;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Repository.DoctorRepository;
import com.DS.HospitalManagementSystem.Repository.PatientRepo;
import com.DS.HospitalManagementSystem.services.AppoitmentService;

public class AppoitmentServiceImp implements AppoitmentService {

	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private DoctorRepository doctorRepo;
	
	@Override
	public void bookAppoitment(AppoitmentDto appoitmentDto) {
		Patient patient= patientRepo.findById(appoitmentDto.getPatient_id()).orElseThrow();
		Doctor doctor=doctorRepo.findById(appoitmentDto.getDoctor_id()).orElseThrow();
		
		Appoitment appoitments=new Appoitment();
	}

}
