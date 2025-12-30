package com.DS.HospitalManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DS.HospitalManagementSystem.Dto.AppoitmentDto;
import com.DS.HospitalManagementSystem.services.AppoitmentService;

@RestController
@RequestMapping("/appointment")
public class AppoitmentController {
	
	@Autowired
	private AppoitmentService appoitmentService;
	
	
	
	public ResponseEntity<String> bookAppoitment(@RequestBody AppoitmentDto appoitmentDto)
	{
		return new ResponseEntity<String>(appoitmentService.bookAppoitment(appoitmentDto),HttpStatus.CREATED);
	}
}
