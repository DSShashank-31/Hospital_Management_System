package com.DS.HospitalManagementSystem.Dto;

import lombok.Data;

@Data
public class DoctorResponseDto {

	private Long id;
	private String name;
	private String specialization;
	private Long phone_number;
	private int experience;
	private String username;
	private String department;
}
