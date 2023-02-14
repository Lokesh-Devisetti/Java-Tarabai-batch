package com.bitlabs.HibernateSample;

/**
 * Hello world!
 *
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

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
    private static FileInputStream fis;

	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
     /*   Configuration cfg=new Configuration();
        cfg.configure("com/bitlabs/HibernateDemo/Hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();*/
      
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s=sf.openSession();
       
        Student12 st=new Student12();
        st.setId(107);
        st.setName("lokesh");
        st.setEmailid("lokesh@gmail.com");
  
        Address a=new Address();
        a.setStreet("ngo colony");
        a.setCity("kadapa");
        a.setOpen(true);
        a.setX(10.1);
        a.setAddedDate(new Date());
        
        fis = new FileInputStream("src/main/java/image.jpg");
        byte [] data=new byte[fis.available()];
        fis.read(data);
        
        a.setImage(data);
        
        
        Transaction tx=s.beginTransaction();
        s.save(st);
        s.save(a);
        tx.commit();
        s.close();
    }
}