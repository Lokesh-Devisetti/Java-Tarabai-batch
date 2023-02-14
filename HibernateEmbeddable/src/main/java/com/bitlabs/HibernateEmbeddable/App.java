package com.bitlabs.HibernateEmbeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

         Certificate ce=new Certificate();
         ce.setCourse("full stack");
         ce.setDuration(6);
         Student124 stu=new Student124();
         stu.setId(108);
         stu.setName("lokesh");
         stu.setCerti(ce);
         Session s=sf.openSession();
         Transaction tx=s.beginTransaction();
         s.save(stu);
         tx.commit();
         s.close();
    
    
    
    
    }
    
}
