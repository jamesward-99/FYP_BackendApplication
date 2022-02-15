package com.fyp.systembackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fyp.systembackend.entities.Story;
import com.fyp.systembackend.repository.StoryRepository;

@Service
public class StoryServiceImpl implements StoryService {

	@Autowired
	private StoryRepository storyRepository;
	
	@Override
	public Story saveStory(Story story) {
		return storyRepository.save(story);
	}

	@Override
	public List<Story> getAllStories() {
		return storyRepository.findAll();
	}
}