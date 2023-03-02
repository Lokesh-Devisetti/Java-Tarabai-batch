package com.bitlabs.Dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Student;

public class DaoImplementation {
	public void registration(Student stu) {
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	
    	s.save(stu);
    	System.out.println("Registered successfully");
    	tx.commit();
    	s.close();
	}
	public void login(Student stu) {
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	System.out.println("Enter student email address");
    	String email_address=sc.next();
    	System.out.println("Enter student password");
    	String password=sc.next();
    	s.save(stu);
    	System.out.println("login successfully");
    	tx.commit();
    	s.close();
	}
}
