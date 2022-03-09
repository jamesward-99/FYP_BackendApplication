package com.fyp.systembackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyp.systembackend.entities.Profile;
import com.fyp.systembackend.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public Profile saveActivity(Profile profile) {
		return profileRepository.save(profile);
	}
}