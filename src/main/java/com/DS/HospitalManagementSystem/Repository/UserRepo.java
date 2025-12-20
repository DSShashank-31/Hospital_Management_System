package com.DS.HospitalManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DS.HospitalManagementSystem.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
	Optional<String> findByUsername(String username);

}
