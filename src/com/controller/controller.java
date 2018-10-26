package com.controller;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;
import com.model.StudentMark;


public class controller
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentMark.class);
		SessionFactory sf=cfg.buildSessionFactory();
		
		//Session s=sf.getCurrentSession();
		Session s=sf.openSession();
		
		Student st=new Student("sham","mane","tammane@gmail.com");
		
		StudentMark sm=new StudentMark("java", 100);
		st.setSm(sm);
		
		s.beginTransaction();
		System.out.println("save data"+st);
		s.save(st);
		s.getTransaction().commit();
		
	}
}
