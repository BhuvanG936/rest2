package com.bhuvan.rest2;

import java.util.Date;

public class User {

private int id;
private String name;
private Date dob;
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
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public User(int id, String name, Date dob) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
}

}
