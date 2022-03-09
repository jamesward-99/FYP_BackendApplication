package com.fyp.systembackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyp.systembackend.entities.Activity;
import com.fyp.systembackend.service.ActivityService;

@RestController
@RequestMapping("/activity")
@CrossOrigin
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	@PostMapping("/addActivity")
	public String add(@RequestBody Activity activity) {
		activityService.saveActivity(activity);
		return "Activity Added!";
	}
	
	@GetMapping("/getAllActivities")
	public List<Activity> getAllActivities(){
		return activityService.getAllActivities();
	}
	
	@RequestMapping(value="/{id}")
	public Activity getActivity(@PathVariable String id) {
		return activityService.getActivity(id);
	}	
}