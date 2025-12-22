package com.DS.HospitalManagementSystem.Mapper;

import org.springframework.stereotype.Component;

import com.DS.HospitalManagementSystem.Dto.DepartmentDto;
import com.DS.HospitalManagementSystem.Entity.Department;

@Component
public class DepartmentMapper {

	public Department mapToDepartment(DepartmentDto departmentDto)
	{
		Department department=new Department();
		department.setName(departmentDto.getName());
		department.setDescription(departmentDto.getDescription());
		
		return department;
	}
	public DepartmentDto mapToDepartmentDto(Department department)
	{
		DepartmentDto departmentDto=new DepartmentDto();
		departmentDto.setId(department.getId());
		departmentDto.setName(department.getName());
		departmentDto.setDescription(department.getDescription());
		return departmentDto;
	}
}
