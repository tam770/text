package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;
import com.model.StudentMark;


public class deleteStudent 
{
public static void main(String[] args) {
	
	int id=2;
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(StudentMark.class)
			.buildSessionFactory();
	
	Session s=sf.openSession();
    Student st=s.get(Student.class,id);
	s.beginTransaction();
	s.delete(st);
	s.getTransaction().commit();
	sf.close();
}
}
