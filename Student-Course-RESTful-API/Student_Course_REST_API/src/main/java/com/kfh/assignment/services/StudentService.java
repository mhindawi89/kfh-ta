package com.kfh.assignment.services;

import java.util.List;

import com.kfh.assignment.beans.Student;
import com.kfh.assignment.exceptions.CourseException;
import com.kfh.assignment.exceptions.StudentException;
import com.kfh.assignment.payload.request.StudentRegisterReq;

public interface StudentService {
	
	public String registerNewStudent(StudentRegisterReq student) throws StudentException;

	public List<Student> viewAllStudentsByCourse(Integer courseId) throws CourseException, StudentException;
	
	public Student updateStudent(Student student) throws StudentException;
	
	public void deleteStudent(Integer roll) throws StudentException;
	
	public String addStudentToCourse(Integer courseId, Integer roll) throws CourseException, StudentException;

}
