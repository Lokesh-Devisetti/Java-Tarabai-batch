package com.bitlabs.Springs_Demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        Object obj1=context.getBean("student");
        Object obj2=context.getBean("student_address");
        Object obj3=context.getBean("book");
        List<Object>list1=new ArrayList();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);
      for(Object o:list1) {
        	System.out.println(o);
       }
        
        		
    }
}
