package com.kfh.assignment.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kfh.assignment.beans.Role;
import com.kfh.assignment.beans.UserRole;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Integer>{
	
	Optional<UserRole> findByUserRole(Role userRole);

}
