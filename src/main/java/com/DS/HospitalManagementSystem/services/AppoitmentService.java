package com.DS.HospitalManagementSystem.services;


import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;

@Service
public interface AppoitmentService {

	
	void bookAppoitment(AppoitmentDto appoitmentDto);

}
