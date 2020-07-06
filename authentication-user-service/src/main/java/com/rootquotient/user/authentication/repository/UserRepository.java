package com.rootquotient.user.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rootquotient.user.authentication.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query(value = "select * from user where u_name =?1", nativeQuery = true)
	public  User findByUsername(String username);

}
