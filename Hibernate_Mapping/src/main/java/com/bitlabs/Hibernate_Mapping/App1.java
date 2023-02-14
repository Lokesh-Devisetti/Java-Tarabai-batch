package com.bitlabs.Hibernate_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity1.Answer1;
import com.bitlabs.Entity1.Question1;

public class App1 {

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        
        
        
        Question1 q=new Question1();
        q.setId(201);
        q.setQuestion("what is java");
        
        Answer1 a1=new Answer1();
       a1.setId(101);
       a1.setAnswer("Java is strongly typed language");
       a1.setQue(q);
       
       Answer1 a2=new Answer1();
       a2.setId(102);
       a2.setAnswer("Java is 100% object oriented");
       a2.setQue(q);
       
       Answer1 a3=new Answer1();
       a3.setId(103);
       a3.setAnswer("Java is secured language");
       a3.setQue(q);
       
       List<Answer1> list=new ArrayList();
       list.add(a1);
       list.add(a2);
       list.add(a3);
       
       q.setAns(list);
       
       s.save(a1);
       s.save(a2);
       s.save(a3);
       
       s.save(q);
       
       
        
        tx.commit();
        
        
        s.close();
        
        
        
    }
}
