package com.kfh.assignment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kfh.assignment.beans.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	Optional<Admin> findByEmailId(String emailId);
	
	boolean existsByEmailId(String emailId);

}
