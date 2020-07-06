package com.rootquotient.user.authentication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rootquotient.user.authentication.model.User;
import com.rootquotient.user.authentication.repository.UserRepository;

@Service
public class Userservice {
	@Autowired
	UserRepository adminRepository;
	
	
	public User getpatient(int id) {
		User adminId = adminRepository.findById(id).get();
		return adminId;
	}
	

}
