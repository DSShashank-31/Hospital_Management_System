package com.DS.HospitalManagementSystem.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private CustomUserDetailsServices customUserDetailsServices;
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(Customizer->Customizer.disable())
			.authorizeHttpRequests(request->
			request
					.requestMatchers("/patient/register").permitAll()
					.requestMatchers("/patient/**").hasRole("PATIENT")
					.requestMatchers("/admin/**").hasRole("DOCTOR")
					.anyRequest().authenticated()
					)
			.httpBasic(Customizer.withDefaults())
			.userDetailsService(customUserDetailsServices);
		return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
