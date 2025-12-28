package com.DS.HospitalManagementSystem.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.DS.HospitalManagementSystem.Entity.User;
import com.DS.HospitalManagementSystem.Repository.UserRepo;

@Service
public class CustomUserDetailsServices implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("username not found"));
		return org.springframework.security.core.userdetails.User
				.withUsername(username)
				.password(user.getPassword())
				.roles(user.getRole().name())
				.disabled(!user.isEnable())
				.build();
	}
	
	
}
