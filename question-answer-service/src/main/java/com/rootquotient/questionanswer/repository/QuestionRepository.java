package com.rootquotient.questionanswer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rootquotient.questionanswer.model.Question;



@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{
//	@Query(value = "select * from tbladmin where pt_firstname =?1", nativeQuery = true)
//	public  Admin findByUsername(String username);

}
