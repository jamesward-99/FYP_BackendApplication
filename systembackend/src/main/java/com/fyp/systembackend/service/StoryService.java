package com.fyp.systembackend.service;

import java.util.List;

import com.fyp.systembackend.entities.Story;

public interface StoryService {
	public Story saveStory(Story story);
	public List<Story> getAllStories();
	public Story getStory(String id);
}