package com.DS.HospitalManagementSystem.services.imp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Dto.DoctorDto;
import com.DS.HospitalManagementSystem.Entity.Department;
import com.DS.HospitalManagementSystem.Entity.Doctor;
import com.DS.HospitalManagementSystem.Entity.User;
import com.DS.HospitalManagementSystem.Mapper.DepartmentMapper;
import com.DS.HospitalManagementSystem.Mapper.DoctorMapper;
import com.DS.HospitalManagementSystem.Repository.DepartmentRepository;
import com.DS.HospitalManagementSystem.Repository.DoctorRepository;
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
	
	@Override
	public DoctorDto registerDoctor(DoctorDto doctorDto)
	{
		Department department=departmentRepo.findByName(doctorDto.getDepartmentName());
		
		User user=new User();
		user.setUsername(doctorDto.getUsername());
		user.setPassword(doctorDto.getPassword());
		userRepo.save(user);
		
		Doctor doctor=doctorMapper.mapToDoctor(doctorDto, user,department);
		Doctor savedDoctor= doctorRepo.save(doctor);
		return doctorMapper.mapToDoctorDto(savedDoctor);
		
	}

	@Override
	public DepartmentDto createDepartment(DepartmentDto departmentDto) {
		Department department=departmentMapper.mapToDepartment(departmentDto);
		Department savedDepartment=departmentRepo.save(department);
		return departmentMapper.mapToDepartmentDto(savedDepartment);
	}

}
