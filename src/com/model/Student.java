package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private int id; 
  private String  fname;
  private String lname;
  private String email;
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="sm_id")
  private StudentMark sm;
  public Student() {
	  
	  
  }
public Student(String fname, String lname, String email) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public StudentMark getSm() {
	return sm;
}
public void setSm(StudentMark sm) {
	this.sm = sm;
}
  

}
