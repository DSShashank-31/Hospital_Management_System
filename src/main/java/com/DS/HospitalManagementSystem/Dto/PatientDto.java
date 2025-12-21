package com.DS.HospitalManagementSystem.Dto;

import lombok.Data;

@Data
public class PatientDto {

	private String username;
	private String password;
	private String confirmPassword;
	
	private Long id;
	private String name;
	private int age;
	private String email;
	private Long mobile_number;
}
