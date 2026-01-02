package com.DS.HospitalManagementSystem.services.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;
import com.DS.HospitalManagementSystem.Entity.Appoitment;
import com.DS.HospitalManagementSystem.Entity.AppoitmentStatus;
import com.DS.HospitalManagementSystem.Entity.Doctor;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Repository.AppoitmentRepository;
import com.DS.HospitalManagementSystem.Repository.DoctorRepository;
import com.DS.HospitalManagementSystem.Repository.PatientRepo;
import com.DS.HospitalManagementSystem.services.AppoitmentService;

public class AppoitmentServiceImp implements AppoitmentService {

	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private DoctorRepository doctorRepo;
	
	@Autowired
	private AppoitmentRepository appoitmentRepository;
	
	@Override
	public Appoitment bookAppoitment(AppoitmentDto appoitmentDto) {
		Patient patient= patientRepo.findById(appoitmentDto.getPatient_id()).orElseThrow();
		Doctor doctor=doctorRepo.findById(appoitmentDto.getDoctor_id()).orElseThrow();
		
		Appoitment appoitments=new Appoitment();
		appoitments.setPatient(patient);
		appoitments.setDoctor(doctor);
		appoitments.setAppointmentTime(appoitmentDto.getAppoitmentsDate());
		appoitments.setReason(appoitmentDto.getReason());
		appoitments.setAppoitmentStatus(AppoitmentStatus.PENDING);
		
		return appoitmentRepository.save(appoitments);
		
	}

}
