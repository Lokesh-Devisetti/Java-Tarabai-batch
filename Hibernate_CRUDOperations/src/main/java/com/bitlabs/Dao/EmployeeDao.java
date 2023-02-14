package com.bitlabs.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Employee12;

import java.util.Scanner;

public class EmployeeDao implements EmployeeDaoInterface{

	
	Scanner sc=new Scanner(System.in);
	
	public void insert() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tx=s.beginTransaction();
    	System.out.println("Enter Employee name");
    	String name=sc.next();
    	System.out.println("Enter employee emil");
    	String email=sc.next();
    	System.out.println("Enter employee salary");
    	int salary=sc.nextInt();
    	System.out.println("Enter employee city");
    	String city=sc.next();
    	Employee12 emp=new Employee12();
    	emp.setName(name);
    	emp.setEmail(email);
    	emp.setSalary(salary);
    	emp.setCity(city);
    	
    	s.save(emp);
    	System.out.println("Inserted data successfully");
    	tx.commit();
    	s.close();
	}
	public void getAllEmployeeDesc() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session s=sf.openSession();
    	
    	Query query=s.createQuery("from Employee12 order by salary desc");
    	List<Employee12> list=new ArrayList();
    	 list=query.list();
    	
    	for(Employee12 x: list) {
    		System.out.println(x.getId()+"    "+x.getName()+"   "+x.getEmail()+"   "+x.getSalary()+" "+x.getCity());
    		
    	}
    	
    	s.close();
	}
	public void getAllEmployeeAsce() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Employee12 order by salary");
		List<Employee12> list=new ArrayList();
		list=query.list();
		for(Employee12 e: list) {
			System.out.println(e.getId()+"    "+e.getName()+"   "+e.getEmail()+"   "+e.getSalary()+" "+e.getCity());
    		
		}
		s.close();
	}
	public void getAllEmployeeRange() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.createQuery("from Employee12 where salary between 22000 and 25000");
		List<Employee12> list=new ArrayList();
		list=query.list();
		for(Employee12 emp: list) {
			System.out.println(emp.getId()+"    "+emp.getName()+"   "+emp.getEmail()+"   "+emp.getSalary()+" "+emp.getCity());
		}
		s.close();
	}
	public void getAllEmployeeGroup() {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		//Query query = s.createQuery("select count(city) from Employee");
		//double count = (Double) query.uniqueResult();
		//System.out.println("count of all citys "+count);
		  //String qlQuery2 = "SELECT COUNT(c) FROM  c"
          //Query query2 = entityManager.createQuery(qlQuery2);
          //Long nOfCities = (Long) query2.getSingleResult();

        //  System.out.printf("There are %d cities%n", nOfCities);
		String str="select count(name),city from Employee12 group by city";
		Query query=s.createQuery(str);
		List<Object[]> list=new ArrayList();
		list=query.list();
		for(Object[] empl:list) {
			System.out.println("count of city:"+empl[0]+" name:"+empl[1]);
		}
	}
	
	
	
	
	
	
	
	
	
//	public void updateById(int id) {
//		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//    	Session s=sf.openSession();
//    	Transaction tx=s.beginTransaction();
//    	
//    	Employee12 obj=s.get(Employee12.class, id);
//    	
//    	obj.setName("lokesh manikanta");
//    	
//    	
//    	s.save(obj);
//    	System.out.println("updated data successfully");
//    	tx.commit();
//    	s.close();
//		
//	}
	
//	public void getEmployeeById(int id) {
//		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//    	Session s=sf.openSession();
//    	Transaction tx=s.beginTransaction();
//    	
//    	Employee12 obj=s.get(Employee12.class, id);
//    	
//    	System.out.println(obj);
//    	
//    	
//    	s.save(obj);
//    	
//    	tx.commit();
//    	s.close();
//	}
//	public void deleteEmployeeById(int id) {
//		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//    	Session s=sf.openSession();
//    	Transaction tx=s.beginTransaction();
//    	
//    	Employee12 obj=s.get(Employee12.class, id);
//    	
//    	System.out.println(obj);
//    	
//    	
//    	s.delete(obj);
//    	System.out.println("Deletd data successfully");
//    	tx.commit();
//    	s.close();
//	}
//	
	}

