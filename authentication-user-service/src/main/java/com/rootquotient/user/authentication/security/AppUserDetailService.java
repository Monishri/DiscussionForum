package com.rootquotient.user.authentication.security;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rootquotient.user.authentication.exception.UsernameAlreadyExistsException;
import com.rootquotient.user.authentication.model.User;
import com.rootquotient.user.authentication.repository.UserRepository;

@Service
public class AppUserDetailService implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppUserDetailService.class);
	@Autowired
	UserRepository userRepository;

	AppUser appUser;
	User user;

	public AppUserDetailService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUserDetailService(UserRepository patientRepository) {
		super();
		this.userRepository = patientRepository;
	}

	
	public UserDetails loadUserByUsername(String fName) throws UsernameNotFoundException {
		System.out.println("name->" + fName);
		user = userRepository.findByUsername(fName);
		System.out.println("loading..." +user);
		if (userRepository == null)
			throw new UsernameNotFoundException("username not found");
		else
		{
		//	System.out.println("user-->" + user.getPassword());
			appUser = new AppUser(user);
			
		}
		return appUser;
	}

	public void signUp(User user) throws UsernameAlreadyExistsException {
		LOGGER.info("SignUp starts");
		String pass = user.getPassword();
		user.setPassword(passwordEncoder().encode(pass));
		String userName = user.getUsername();
		User patientExists = userRepository.findByUsername(userName);
		System.out.println("patient" + userName);
		if (patientExists != null) {
			throw new UsernameAlreadyExistsException();
		} else {
		//	Role role = roleRepository.findById(2);
	//		Set<Role> roleList = new HashSet<Role>();
			//roleList.add(role);
			//user.setRoleList(roleList);
			this.userRepository.save(user);

		}
		LOGGER.info("SignUp ends");
	}

	private PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
