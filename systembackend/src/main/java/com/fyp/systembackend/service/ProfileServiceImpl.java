package com.fyp.systembackend.service;

import java.util.List;

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
	
	@Override
	public List<Profile> getAllProfiles() {
		return profileRepository.findAll();
	}
	
	@Override
	public Profile getProfile(String id) {
		Profile profile = profileRepository.findAll().stream()
				.filter(a -> id.equals(a.getId()))
				.findFirst()
				.orElse(null);
		return profile;
	}
}