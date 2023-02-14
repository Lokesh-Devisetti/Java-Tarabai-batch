package com.bitlabs.Hibernate_CRUDOperations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Dao.EmployeeDao;
import com.bitlabs.Dao.EmployeeDaoInterface;
import com.bitlabs.Entity.Employee12;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        EmployeeDaoInterface dao=new EmployeeDao();
        int option=0;
        
        do {
        	System.out.println("Enter 1 to insert employee data ");
        	System.out.println("Enter 2 to get all employee data in descending order");
//   	System.out.println("Enter 3 to update employee data ");
//        	System.out.println("Enter 4 to get employee by id  ");
//        	System.out.println("Enter 5 to delete employee by id ");
        	System.out.println("Enter 3 to get all employee data in ascending order");
        	System.out.println("Enter 4 to get all employees data salary between some range");
        	System.out.println("Enter 5 to get all employees based on city");
        	System.out.println("Enter 0 to exit ");
        	option=sc.nextInt();
        	
        	switch(option) {
        	case 1:
        		dao.insert();
        		break;
        	case 2:
        		dao.getAllEmployeeDesc();
        		break;
        	case 3:
        		dao.getAllEmployeeAsce();
        		break;
        	case 4:
        		dao.getAllEmployeeRange();
        		break;
        	case 5:
        		dao.getAllEmployeeGroup();
        		break;
//        	case 3:
//        		System.out.println("enter id");
//        		int id=sc.nextInt();
//        		dao.updateById(id);
//        		break;
//        	case 4:
//        		System.out.println("enter id");
//        		int id1=sc.nextInt();
//        		dao.getEmployeeById(id1);
//        		break;
//        	case 5:
//        		System.out.println("enter id");
//        		int id2=sc.nextInt();
//        		dao.deleteEmployeeById(id2);
//        		break;
        	
        	}
        	
        }while(option!=0);
         
    }
}
