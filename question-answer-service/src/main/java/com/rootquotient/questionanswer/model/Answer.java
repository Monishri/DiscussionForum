package com.rootquotient.questionanswer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int answerid;
	
	@Column(name = "a_desc")
	private String ansDesc;
	
	@Column(name = "user_u_id")
	private int userAnsId;
	
	@Column(name = "question_q_id")
	private int quesAnsId;
	
	
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}



	public Answer(int answerid, String ansDesc, int userAnsId, int quesAnsId) {
		super();
		this.answerid = answerid;
		this.ansDesc = ansDesc;
		this.userAnsId = userAnsId;
		this.quesAnsId = quesAnsId;
	}



	public int getAnswerid() {
		return answerid;
	}



	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}



	public String getAnsDesc() {
		return ansDesc;
	}



	public void setAnsDesc(String ansDesc) {
		this.ansDesc = ansDesc;
	}







	public int getUserAnsId() {
		return userAnsId;
	}



	public void setUserAnsId(int userAnsId) {
		this.userAnsId = userAnsId;
	}



	public int getQuesAnsId() {
		return quesAnsId;
	}



	public void setQuesAnsId(int quesAnsId) {
		this.quesAnsId = quesAnsId;
	}



	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", ansDesc=" + ansDesc
				+ ", userAnsId=" + userAnsId + ", quesAnsId=" + quesAnsId + "]";
	}
	
	

	

}
