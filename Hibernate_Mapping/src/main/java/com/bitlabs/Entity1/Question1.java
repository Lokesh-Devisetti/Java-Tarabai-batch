package com.bitlabs.Entity1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1 {

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", ans=" + ans + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the ans
	 */
	public List<Answer1> getAns() {
		return ans;
	}

	/**
	 * @param ans the ans to set
	 */
	public void setAns(List<Answer1> ans) {
		this.ans = ans;
	}

	@Id
	private int id;
	private String question;
	
	@OneToMany(mappedBy="que")
	private List<Answer1> ans;
	
	
}
