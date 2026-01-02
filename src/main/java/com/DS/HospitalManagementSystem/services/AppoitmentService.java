package com.DS.HospitalManagementSystem.services;


import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;
import com.DS.HospitalManagementSystem.Entity.Appoitment;

@Service
public interface AppoitmentService {

	
	Appoitment bookAppoitment(AppoitmentDto appoitmentDto);

}
