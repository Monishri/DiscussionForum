
package com.rootquotient.user.authentication.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	@NotNull
	int userId;
	
	@Column(name="u_name")	
	String username;
	
	//@JsonIgnore
	@Column(name="u_pwd")
	@NotNull(message = "Password should not be null")
	@NotBlank(message = "Password should not be blank")
	String password;
	
	@Column(name = "u_email")
	String email;
	
	@Column(name = "u_fname")
	String firstName;

	@Column(name = "u_lname")
	String lastName;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(
			@NotNull int userId,
			String username,
			@NotNull(message = "Password should not be null") @NotBlank(message = "Password should not be blank") String password,
			String email, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username
				+ ", password=" + password + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}


	

	

	

}
