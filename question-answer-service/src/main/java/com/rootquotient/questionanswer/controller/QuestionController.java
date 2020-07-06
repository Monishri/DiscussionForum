package com.rootquotient.questionanswer.controller;

/*
 * 
 * This is the DoctorController Class,
 * 
 * Which provides the basic Rest service related to the Doctor View Page.
 * 
 * */
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






import com.rootquotient.questionanswer.model.Answer;
import com.rootquotient.questionanswer.model.Question;
import com.rootquotient.questionanswer.service.UserService;

@RestController
@RequestMapping("/Question")
public class QuestionController {

	@Autowired
	private UserService userService;
	
	/*1. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Question/AllQuestions
	 * 
	 * */
	
	@GetMapping("/AllQuestions")
	public Collection<Question> getAllQuestions()
	{
		return userService.getAllQuestion();
	}
	
	/*2. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Question/AnswerForQuestion
	 * 
	 * */
	@GetMapping("/AnswerForQuestion/{id}")
	public Collection<Answer> getAllAnswersByQId(@PathVariable("id") Integer QuestionId)
	{
		return userService.getAllAnswersByQId(QuestionId);
	}
	
	 
	/*3. Working Service
	 * Demo URL:http://localhost:8082/Question/CreateQuestion/followed by question JSON details
	 * 
	 * Input:
	 * q_id`, ``, ``, `
	 *         {

        "questionid": 1, // here, u don't need to give the Id Because it was generated automatically.
        "title": "life",
        "tags": null,
        "description": "What is life ?",
        "userid": 2
    
         }
     *
	 */
	@PostMapping(path = "/CreateQuestion")
	public void createQuestion(@RequestBody Question question)
	{
		userService.createQuestion(question);
	}
	
	/*4. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Question/UpdateQuestion/followed by updated question 
	 * 
	 * */
	@RequestMapping("/UpdateQuestion")
	public void updateQuestion(@RequestBody Question question) {
		userService.updateQuestion(question);
	} 
	
	/*4. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Question/DeleteQuestion/followed by id
	 * 
	 * */
	@DeleteMapping("/DeleteQuestion/{id}")
	public void deleteQuestion(@PathVariable("id") Integer questionId)
	{
		userService.deleteQuestion(questionId);
	}
	
	
}
