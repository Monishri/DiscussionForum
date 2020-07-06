package com.rootquotient.user.authentication.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.rootquotient.user.authentication.model.User;

public class AppUser implements UserDetails {
	private User user; // entity reference
	private Collection<? extends GrantedAuthority> authorities; // to store role details

	public AppUser(User user) {
		super();
		this.user = user;
//		this.authorities = user.getRoleList().stream()
//				.map(role -> new SimpleGrantedAuthority(role.getRoleName()))
//				.collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return getAuthoritiesX();
	}
//	@Override
	public Collection<? extends GrantedAuthority> getAuthoritiesX() {
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		list.add(new SimpleGrantedAuthority("user"));
		return list;
	}


	

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
