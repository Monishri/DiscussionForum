package com.rootquotient.questionanswer.service;

/*
 * This is the general Service Class,
 * 
 * Which give all basic services for our Application
 * 
 * It Internally Use the following Repositories
 * 
 * 1.AppointmentRepository
 * 
 * 2.DoctorRepository
 * 
 * 3.MedicareRepository
 * 
 * 4.PatientRepository
 * 
 * 5.PatientHistoryRepository
 * 
 * */

import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rootquotient.questionanswer.model.Question;
import com.rootquotient.questionanswer.model.Answer;
import com.rootquotient.questionanswer.repository.AnswerRepository;
import com.rootquotient.questionanswer.repository.QuestionRepository;

@Service
public class UserService {

	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	
	
	/*Main Service's Methods Begin*/
	
	/*
	 * 
	 * #################### <--------------------------------The Following methods are all related to Patient View Page---------------------------------------->########################
	 *                                                      ((((((((((((((  Question Service Methods  ))))))))))))))))))
	 * 
	 * */
	
	/*This method gets all questions */
	public Collection<Question> getAllQuestion()
	{
		return questionRepository.findAll();
	}
	
	/*This method gets all answers for a particular question*/
	public Collection<Answer> getAllAnswersByQId(Integer QuestionId) {
		return answerRepository.findAllAnswerByQuestionId(QuestionId);
	}
	
	/*This method creates a new question*/
	public void createQuestion(Question question)
	{
		questionRepository.save(question);
	}
	
	/*This method updates question*/
	public void updateQuestion(Question question)
	{
		questionRepository.save(question);
		
	}
	
	/*This method deletes question*/
	public void deleteQuestion(Integer questionId)
	{
		answerRepository.deleteAnswerByQuestionId(questionId);
		
		questionRepository.deleteById(questionId);
		
	}

/*Main Service's Methods Begin*/
	
	/*
	 * 
	 * #################### <--------------------------------The Following methods are all related to Patient View Page---------------------------------------->########################
	 *                                                      ((((((((((((((  Answer Service Methods  ))))))))))))))))))
	 * 
	 * 
	 *  */

	/*This method gets all questions */
	public Collection<Answer> getAllAnswers()
	{
		return answerRepository.findAll();
	}
	
	/*This method saves a new answer */
	public void postAnswer(Answer answer)
	{
		 answerRepository.save(answer);
	}
	
	/*This method edits an existing answer */
	public void editAnswer(Answer answer)
	{
		answerRepository.save(answer);
	}
	
	public void deleteAnswer(Integer ansId)
	{
		answerRepository.deleteById(ansId);
	}
	
	
	
}
