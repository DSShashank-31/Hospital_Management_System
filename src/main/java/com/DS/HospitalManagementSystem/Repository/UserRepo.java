package com.DS.HospitalManagementSystem.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DS.HospitalManagementSystem.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
	

}
