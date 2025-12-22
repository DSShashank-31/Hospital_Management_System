package com.DS.HospitalManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DS.HospitalManagementSystem.Entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	
}
