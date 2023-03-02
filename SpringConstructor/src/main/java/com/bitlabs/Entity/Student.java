package com.bitlabs.Entity;

import java.util.List;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private List<String> list;
	private Set<String> set;
	
	public Student(int id, String name, List<String> list, Set<String> set) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.set = set;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", list=" + list + ", set=" + set + "]";
	}
   
	
	
	
}

