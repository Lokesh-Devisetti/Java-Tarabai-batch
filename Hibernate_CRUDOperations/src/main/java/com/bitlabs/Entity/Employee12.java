package com.bitlabs.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee12 {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="emp_id")
	private int id;
@Column(name="emp_name")
private String name;
@Column(name="emp_email")
private String email;
@Column(name="emp_salary")
private int salary;
@Column(name="emp_city")
private String city;
public Employee12(String name, String email, int salary,String city) {
	super();
	this.name = name;
	this.email = email;
	this.salary = salary;
	this.city=city;
}
public Employee12() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee12 [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", city=" + city
			+ "]";
}


}
