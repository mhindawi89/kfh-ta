package com.kfh.assignment.services;

import java.util.List;

import com.kfh.assignment.beans.Course;
import com.kfh.assignment.exceptions.CourseException;

public interface CourseService {
	
	public Course registerNewCourse(Course course) throws CourseException;

	public List<Course> viewAllCourses() throws CourseException;
	
	public Course updateCourse(Course course) throws CourseException;
	
	public void deleteCourse(Integer courseId) throws CourseException;

}
