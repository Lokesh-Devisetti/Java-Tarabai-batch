package com.bitlabs.Hibernate_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity2.Employee;
import com.bitlabs.Entity2.Project;

public class App2 {
public static void main(String args[]) {
	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    
    Session s=sf.openSession();
    Transaction tx=s.beginTransaction();
    Employee e1=new Employee();
    Employee e2=new Employee();
    Employee e3=new Employee();
    e1.setId(101);
    e1.setEname("lokesh");
    
    e2.setId(102);
    e2.setEname("devisetti");
    
    e3.setId(103);
    e3.setEname("sairam");
    
    Project p1=new Project();
    Project p2=new Project();
    Project p3=new Project();
    
    p1.setId(201);
    p1.setPname("java project");
    
    p2.setId(202);
    p2.setPname("python project");
    
    p3.setId(203);
    p3.setPname("Frontend project");
    
    
    List<Project> listP=new ArrayList();
    List<Employee> listE=new ArrayList();
    
    listP.add(p1);
    listP.add(p2);
    listP.add(p3);
    
    listE.add(e2);
    listE.add(e1);
    listE.add(e3);
    
    e1.setP(listP);
    p1.setE(listE);
    
    
    s.save(e1);
    s.save(e2);
    s.save(e3);
    s.save(p1);
    s.save(p2);
    s.save(p3);
    
    
    
    tx.commit();
    s.close();
}
}
