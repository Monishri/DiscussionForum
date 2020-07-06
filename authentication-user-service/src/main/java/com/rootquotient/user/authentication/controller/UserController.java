package com.rootquotient.user.authentication.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootquotient.user.authentication.exception.UsernameAlreadyExistsException;
import com.rootquotient.user.authentication.model.User;
import com.rootquotient.user.authentication.repository.UserRepository;
import com.rootquotient.user.authentication.security.AppUserDetailService;
import com.rootquotient.user.authentication.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;

	@Autowired
	AppUserDetailService appUserDetailService;

	@Autowired
	Userservice userservice;
	@PostMapping("")
	public void signup(@RequestBody @Valid User user) throws UsernameAlreadyExistsException {
		appUserDetailService.signUp(user);

	
	}
}
