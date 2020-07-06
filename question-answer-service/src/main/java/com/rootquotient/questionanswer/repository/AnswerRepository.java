package com.rootquotient.questionanswer.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rootquotient.questionanswer.model.Answer;


@Repository
public interface AnswerRepository  extends JpaRepository<Answer,Integer> {
//
//	@Query(value = "SELECT * FROM tblpatient where mt_dr_user_id= ?1", nativeQuery = true)
//	public Collection<PatientTestReport> findAllPatientsDetailstByDoctorId(Integer doctorId);
	
	@Query(value = "SELECT * FROM Answer where question_q_id= ?1", nativeQuery = true)
	public Collection<Answer>findAllAnswerByQuestionId(Integer QuestionId);
	
	@Query(value = "DELETE FROM Answer where question_q_id = ?1", nativeQuery = true)
	public void deleteAnswerByQuestionId(Integer QuestionId);
}
