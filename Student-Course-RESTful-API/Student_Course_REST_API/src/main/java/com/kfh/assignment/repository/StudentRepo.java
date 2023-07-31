package com.kfh.assignment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kfh.assignment.beans.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	Optional<Student> findByEmailId(String emailId);

}
