package com.rootquotient.questionanswer.controller;

/*
 * 
 * This is the AnswerController Class,
 * 
 * Which provides the basic Rest service related to the Patient View Page.
 * 
 * */

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.rootquotient.questionanswer.model.Answer;
import com.rootquotient.questionanswer.service.UserService;

@RestController
@RequestMapping("/Answer")
public class AnswerController {

	AnswerController()
	{
		System.out.println("AnswerController Bean was creatred Successfully");
	}
	@Autowired
	private UserService userService;
	
	/*1. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Answer/AllAnswers
	 * 
	 * */
	
	@GetMapping("/AllAnswers")
	public Collection<Answer> getAllAnswers()
	{
		return userService.getAllAnswers();
	}
	
	/*2. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Answer/postAnswer
	 * 
	 * */
	
	@PostMapping("/postAnswer")
	public void postAnswer(@RequestBody Answer answer)
	{
		
		 userService.postAnswer(answer);
	}
	
	/*3. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Answer/editAnswer
	 * 
	 * */
	
	@RequestMapping("/EditAnswer")
	public void editAnswer(@RequestBody Answer answer)
	{
		 userService.editAnswer(answer);
	}
	
	/*4. Working Service*/
	/*
	 * Demo URL:http://localhost:8082/Answer/DeleteAnswer
	 * 
	 * */
	
	@DeleteMapping("/DeleteAnswer/{id}")
	public void deleteAnswer(@PathVariable Integer ansId)
	{
		userService.deleteAnswer(ansId);
	}
	
}