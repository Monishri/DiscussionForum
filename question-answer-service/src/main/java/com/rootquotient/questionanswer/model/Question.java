package com.rootquotient.questionanswer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "q_id")
	private int questionid;
	
	@Column(name = "q_title")
	private String title;
	
	@Column(name = "q_tags")
	private String tags;
	
	@Column(name = "q_desc")
	private String description;
	
	@Column(name = "user_u_id")
	private int userid;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionid, String title, String tags, String description,
			int userid) {
		super();
		this.questionid = questionid;
		this.title = title;
		this.tags = tags;
		this.description = description;
		this.userid = userid;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", title=" + title
				+ ", tags=" + tags + ", description=" + description
				+ ", userid=" + userid + "]";
	}
	

	

}
