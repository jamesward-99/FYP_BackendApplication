package com.fyp.systembackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyp.systembackend.entities.Activity;
import com.fyp.systembackend.repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepository;
	
	@Override
	public Activity saveActivity(Activity activity) {
		return activityRepository.save(activity);
	}

	@Override
	public List<Activity> getAllActivities() {
		return activityRepository.findAll();
	}
	
	@Override
	public Activity getActivity(String id) {
		Activity activity = activityRepository.findAll().stream()
				.filter(a -> id.equals(a.getId()))
				.findFirst()
				.orElse(null);
		return activity;
	}

	@Override
	public Activity updateActivity(Activity activity) {
		return activityRepository.save(activity);
	}
}