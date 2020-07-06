package com.rootquotient.user.authentication.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.rootquotient.user.authentication.repository.UserRepository;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {
	@Autowired
	UserRepository userRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@GetMapping("/authenticate")
	public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
		Map<String, String> authenticationMap = new HashMap<String, String>();
		LOGGER.info("Auth Start");
		LOGGER.debug("authHeader :" + authHeader);
		String user = getUser(authHeader);
//		String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities()
//				.toArray()[0].toString();
		System.out.println(user);
		int id = userRepository.findByUsername(user).getUserId();
		authenticationMap.put("id", "" + id);
//		authenticationMap.put("role", role);
		authenticationMap.put("user", user);
		authenticationMap.put("token", generateJwt(user));
		LOGGER.info("End");
		return authenticationMap;

	}

	private String getUser(String authHeader) {
		LOGGER.info("getuser Start");
		String encodedCredentials = authHeader.substring(authHeader.indexOf(" ") + 1);
		byte[] decodedText = Base64.getDecoder().decode(encodedCredentials);
		LOGGER.debug("decodedText: " + decodedText);
		String decodedString = new String(decodedText);
		LOGGER.debug("decodedString: " + decodedString);
		String user = decodedString.substring(0, decodedString.indexOf(":"));
		LOGGER.debug("user: " + user);
		LOGGER.info("End");
		return user;
	}

	private String generateJwt(String user) {
		LOGGER.info("JWT Start");
		JwtBuilder builder = Jwts.builder();
		builder.setSubject(user);

		// Set the token issue time as current time
		builder.setIssuedAt(new Date());

		// Set the token expiry as 20 minutes from now
		builder.setExpiration(new Date((new Date()).getTime() + 1200000));
		builder.signWith(SignatureAlgorithm.HS256, "secretkey");

		String token = builder.compact();
		LOGGER.info("JWT End");
		return token;

	}
}
