package com.bitlabs.Entity;

public class Book {
	private int id;
	private String bname;
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
}
