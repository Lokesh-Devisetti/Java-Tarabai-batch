package com.bitlabs.Entity1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	private int id;
	private String answer;
	
	@ManyToOne
	private Question1 que;
	/**
	 * @return the que
	 */
	public Question1 getQue() {
		return que;
	}
	/**
	 * @param que the que to set
	 */
	public void setQue(Question1 que) {
		this.que = que;
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
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer1 [id=" + id + ", answer=" + answer + ", que=" + que + "]";
	}
	
	
	
}
