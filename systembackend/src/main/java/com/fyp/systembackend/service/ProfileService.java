package com.fyp.systembackend.service;

import java.util.List;

import com.fyp.systembackend.entities.Profile;

public interface ProfileService {
	public Profile saveActivity(Profile profile);
	public List<Profile> getAllProfiles();
	public Profile getProfile(String id);
}