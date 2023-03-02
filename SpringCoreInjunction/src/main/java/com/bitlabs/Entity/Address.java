package com.bitlabs.Entity;

public class Address {
private int id;
private String city;
private Employee empl;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Employee getEmpl() {
	return empl;
}
public void setEmpl(Employee empl) {
	this.empl = empl;
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", empl=" + empl + "]";
}
}
