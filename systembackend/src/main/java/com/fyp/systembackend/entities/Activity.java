package com.fyp.systembackend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ACTIVITY")
@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "ACTIVITY_ID")
	private long ActivityId;
	
	@Column(name = "ACTIVITY_TITLE")
	private String title;
	
	@Column(name = "ACTIVITY_DATE")
	private Date date;
	
	@Column(name = "ACTIVITY_TIME")
	private String time;
	
	@Column(name = "ACTIVITY_LOCATION")
	private String location;
	
	@Column(name = "ACTIVITY_CATEGORY")
	private String category;
	
	@Column(name = "ACTIVITY_DESCRIPTION")
	private String description;
	
	public long getActivityId() {
		return ActivityId;
	}
	public void setActivityId(long activityId) {
		ActivityId = activityId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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