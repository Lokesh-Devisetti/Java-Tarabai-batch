package com.bitlabs.HibernateSample;


	import javax.persistence.Entity;
	import javax.persistence.Id;
	@Entity
	public class Student12 {
	@Id
	private int id;
	private String name;
	private String emailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "student123 [id=" + id + ", name=" + name + ", emailid=" + emailid + "]";
	}

	}

