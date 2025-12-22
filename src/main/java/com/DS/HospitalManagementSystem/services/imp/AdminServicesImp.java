package com.DS.HospitalManagementSystem.services.imp;



import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;
import com.DS.HospitalManagementSystem.Dto.PatientResopnseDto;
import com.DS.HospitalManagementSystem.Entity.Department;
import com.DS.HospitalManagementSystem.Entity.Doctor;
import com.DS.HospitalManagementSystem.Entity.Patient;
import com.DS.HospitalManagementSystem.Entity.User;
import com.DS.HospitalManagementSystem.Mapper.DepartmentMapper;
import com.DS.HospitalManagementSystem.Mapper.DoctorMapper;
import com.DS.HospitalManagementSystem.Mapper.PatientMapper;
import com.DS.HospitalManagementSystem.Repository.DepartmentRepository;
import com.DS.HospitalManagementSystem.Repository.DoctorRepository;
import com.DS.HospitalManagementSystem.Repository.PatientRepo;
import com.DS.HospitalManagementSystem.Repository.UserRepo;
import com.DS.HospitalManagementSystem.services.AdminServices;

@Service
public class AdminServicesImp implements AdminServices {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	@Autowired
	private DoctorMapper doctorMapper;
	
	@Autowired
	private DoctorRepository doctorRepo;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private PatientMapper patientMapper;
	
	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public void registerDoctor(DoctorDto doctorDto)
	{
		Department department=departmentRepo.findById(doctorDto.getDepartmentId())
				.orElseThrow(()->new RuntimeException("Department Not Found"));
		
		User user=new User();
		user.setUsername(doctorDto.getUsername());
		user.setPassword(doctorDto.getPassword());
		userRepo.save(user);
		
		Doctor doctor=doctorMapper.mapToDoctor(doctorDto, user,department);
		 doctorRepo.save(doctor);
		
		
	}

	@Override
	public void createDepartment(DepartmentDto departmentDto) {
		Department department=departmentMapper.mapToDepartment(departmentDto);
		departmentRepo.save(department);
		
	}

	@Override
	public List<PatientResopnseDto> getAllPatients() {
		List<Patient> patient=patientRepo.findAll();
		return patient.stream().map((patients)->patientMapper.mapToPatientDto(patients)).collect(Collectors.toList());
	}

	

}
