package com.example.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springrest.entities.Course;


public interface CourseDao extends JpaRepository<Course, Long> {
	
}
