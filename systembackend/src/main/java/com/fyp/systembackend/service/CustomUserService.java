package com.fyp.systembackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fyp.systembackend.entities.User;
import com.fyp.systembackend.repository.UserDetailsRepository;

@Service
public class CustomUserService implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDetailsRepository.findByUserName(username);
		
		if(null == user) {
			throw new UsernameNotFoundException("User Not Found with userName " + username);
		}
		return user;
	}
}