package com.example.springrest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.springrest.dao.CourseDao;
import com.example.springrest.entities.Course;

@Service
public class CourceServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourceServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(12,"Java Core","This Course Contain all basic concepts about JAVA"));
//		list.add(new Course(13,"Java Core plus","This Course Contain all basic concepts about JAVA"));
//		list.add(new Course(14,"Java Core pro","This Course Contain all basic concepts about JAVA"));
//		list.add(new Course(15,"Java Core pro Max","This Course Contain all basic concepts about JAVA"));
	}
	
	
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}



	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
