package com.DS.HospitalManagementSystem.Dto;

import lombok.Data;

@Data
public class AppoitmentDto {
	
	private Long id;
	private Long doctor_id;
	private Long patient_id;
	private String reason;
}
