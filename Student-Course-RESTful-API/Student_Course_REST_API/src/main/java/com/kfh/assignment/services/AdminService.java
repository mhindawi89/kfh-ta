package com.kfh.assignment.services;

import com.kfh.assignment.exceptions.UserException;
import com.kfh.assignment.payload.request.AdminRegisterReq;

public interface AdminService {
	
	public String registerNewAdmin(AdminRegisterReq admin) throws UserException;
	
	public String getCurrentLoggedInUser();
}
