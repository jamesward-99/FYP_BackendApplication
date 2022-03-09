package com.fyp.systembackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyp.systembackend.entities.Profile;
import com.fyp.systembackend.service.ProfileService;

@RestController
@RequestMapping("/profile")
@CrossOrigin
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@PostMapping("/addProfile")
	public String add(@RequestBody Profile profile) {
		profileService.saveActivity(profile);
		return "Profile Added!";
	}	
}