package com.bitlabs.SpringConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.Entity.Amibguity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        // Student student=(Student) context.getBean("student");
         //System.out.println(student);
         
         Amibguity am=(Amibguity) context.getBean("ambiguity");
         
         System.out.println(am);
         am.show();
    
    }
}
