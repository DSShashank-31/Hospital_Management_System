package com.DS.HospitalManagementSystem.Dto;

import lombok.Data;

@Data
public class DoctorDto {

	private String username;
	private String password;
	
	private Long id;
	private String name;
	private String specialization;
	private Long phone_number;
	private int experience;
	
	private Long departmentId;
}
