package com.fyp.systembackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyp.systembackend.entities.Story;
import com.fyp.systembackend.service.StoryService;

@RestController
@RequestMapping("/story")
@CrossOrigin
public class StoryController {
	
	@Autowired
	private StoryService storyService;
	
	@PostMapping("/addStory")
	public String add(@RequestBody Story story) {
		storyService.saveStory(story);
		return "Story Added!";
	}
	
	@GetMapping("/getAllStories")
	public List<Story> getAllStories(){
		return storyService.getAllStories();
	}
	
	@RequestMapping(value="/{id}")
	public Story getStory(@PathVariable String id) {
		return storyService.getStory(id);
	}
	
	@PutMapping(value="/{id}")
	public Story updateStory(@PathVariable String id, @RequestBody Story story) {
		story.setId(id);
		return storyService.updateStory(story);
	}
}