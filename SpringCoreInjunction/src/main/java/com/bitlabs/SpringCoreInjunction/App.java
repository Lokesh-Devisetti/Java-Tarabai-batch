package com.bitlabs.SpringCoreInjunction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.Entity.Address;
import com.bitlabs.Entity.Employee;

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
        Address ad=(Address) context.getBean("address");
        //System.out.println(ad.getId());
        //System.out.println(ad.getCity());
        //System.out.println(ad.getEmpl());
        System.out.println(ad);
        
    }
}
