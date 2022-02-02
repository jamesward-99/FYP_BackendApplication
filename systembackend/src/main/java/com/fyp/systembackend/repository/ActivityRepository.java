package com.fyp.systembackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fyp.systembackend.entities.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {}