package com.bitlabs.Hibernate_Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Answer;
import com.bitlabs.Entity.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Question qu=new Question();
        qu.setId(101);
        qu.setQuestion("Who invented java");
        Answer an=new Answer();
        an.setId(201);
        an.setAnswer("java was developed by james Gosling");
        an.setQue(qu);
        qu.setAns(an);
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(qu);
        s.save(an);
        tx.commit();
        s.close();
        

    }
}
