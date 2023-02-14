package com.bitlabs.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
@Id
	private int id;
private String question;
@OneToOne(mappedBy="que")
private Answer ans;
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int id, String question, Answer ans) {
	super();
	this.id = id;
	this.question = question;
	this.ans = ans;
}
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Question [id=" + id + ", question=" + question + ", ans=" + ans + "]";
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAns() {
	return ans;
}
public void setAns(Answer ans) {
	this.ans = ans;
}
}
