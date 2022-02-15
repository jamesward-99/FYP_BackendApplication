package com.fyp.systembackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fyp.systembackend.entities.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer> {}
