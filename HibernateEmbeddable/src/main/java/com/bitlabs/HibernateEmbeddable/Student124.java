package com.bitlabs.HibernateEmbeddable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student124 {
	@Id
private int id;
private String name;
private Certificate certi;
public Student124(int id, String name, Certificate certi) {
	super();
	this.id = id;
	this.name = name;
	this.certi = certi;
}
public Student124() {
	super();
	// TODO Auto-generated constructor stub
}
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
public Certificate getCerti() {
	return certi;
}
public void setCerti(Certificate certi) {
	this.certi = certi;
}

}
