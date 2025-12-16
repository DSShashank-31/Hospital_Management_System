package com.DS.HospitalManagementSystem.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PatientDto {

	private Long id;
	private String name;
	private int age;
	private String email;
	private Long mobile_number;
}
