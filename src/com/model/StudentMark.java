package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentMark
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int m_id;
@Column(name="subject")
private String subject;
@Column(name="mark")
private int mark;

public StudentMark() {

}

public StudentMark(String subject, int mark) {
	super();
	this.subject = subject;
	this.mark = mark;
}


public int getM_id() {
	return m_id;
}

public void setM_id(int m_id) {
	this.m_id = m_id;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public int getMark() {
	return mark;
}

public void setMark(int mark) {
	this.mark = mark;
}


}


