package com.fyp.systembackend.service;

import java.util.List;

import com.fyp.systembackend.entities.Activity;

public interface ActivityService {
	public Activity saveActivity(Activity activity);
	public List<Activity> getAllActivities();
	public Activity getActivity(String id);
}