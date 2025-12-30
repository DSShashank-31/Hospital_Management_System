package com.DS.HospitalManagementSystem.services;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;

@Service
public interface AppoitmentService {

	
	String bookAppoitment(AppoitmentDto appoitmentDto);

}
