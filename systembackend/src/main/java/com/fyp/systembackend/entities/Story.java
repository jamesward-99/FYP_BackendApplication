package com.fyp.systembackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "STORY")
@Entity
public class Story {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "STORY_TITLE")
	private String title;
	
	@Column(name = "STORY_DATE")
	private String date;
	
	@Column(name = "STORY_LOCATION")
	private String location;
	
	@Column(name = "STORY_CATEGORY")
	private String category;
	
	@Column(name = "STORY_DESCRIPTION")
	private String description;
	
	public String getId() {
		return id; 
	}
	public void setId(String id) { 
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() { // Date changed to String
		return date;
	}
	public void setDate(String date) { // Date changed to String
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}