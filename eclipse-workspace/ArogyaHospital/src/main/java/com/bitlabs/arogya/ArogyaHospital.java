package com.bitlabs.arogya;
	import java.util.*;
	public class ArogyaHospital {
	    int id,age;
	    String name, gender, city,address, doa, gname,gaddress,gcontact, recovery;
	    long adhar,contact;
	    public static void main(String[] args)
	    {
	        DaoInterface dao=new DaoImpl();
	        PatientInfo p=new PatientInfo();
	        Scanner sc=new Scanner(System.in);
	        boolean ch=true;
	        try
	        {
	            while(ch)
	            {
	                System.out.println("*************Menu**************");
	                System.out.println("1.Patient Registration\n2.View All patients\n3.Search patient by id\n4.search patient by city                    \n5.search by age group\n6.Mark as recovery\n7.Delete patient by id\n0.exit");
	                System.out.println("Enter choice from menu");
	                int choice=sc.nextInt();
	                switch(choice)
	                {
	                    case 1:
	                        System.out.println("Enter patient name");
	                        String name=sc.next();
	                        p.setName(name);
	                        
	                        System.out.println("Enter the patient gender");
	                        String gender=sc.next();
	                        p.setGender(gender);
	                        System.out.println("Enter patient City");
	                        String city=sc.next();
	                        p.setCity(city);
	                        System.out.println("Enter patient age");
	                        int age=sc.nextInt();
	                        p.setAge(age);
	                        System.out.println("Enter patient AdharNumber");
	                        long aadharcard=sc.nextLong();
	                        p.setAadharcard(aadharcard);
	                        System.out.println("Enter patient MobileNumber");
	                        long contact=sc.nextLong();
	                        p.setContact(contact);
	                       
	                        System.out.println("Enter patient Address");
	                        String address=sc.next();
	                        p.setAadress(address);
	                        System.out.println("Enter patient Date of Adimission(YY-MM-DD");
	                        String dateofadmission=sc.next();
	                        p.setDateofadmission(dateofadmission);
	                        System.out.println("Enter Guardians name");
	                        String g_name=sc.next();
	                        p.setG_name(g_name);
	                        System.out.println("Enter Guardians Address");
	                        String g_aadress=sc.next();
	                        p.setG_aadress(g_aadress);
	                        System.out.println("Enter Guardians contact");
	                        long g_contact=sc.nextLong();
	                        p.setG_contact(g_contact);
	                        dao.patientRegistration(p);
	                        break;
	                    case 2:
	                        dao.viewAllPatient();
	                        break;
	                    case 3:
	                        System.out.println("Enter Patient Id you want see");
	                        int id1=sc.nextInt();
	                        dao.searchPatientById(id1);
	                        break;
	                    case 4:
	                        System.out.println("Enter patient city to view all patients in that city");
	                        String ci=sc.next();
	                        dao.searchPatientByCity(ci);
	                        break;
	                    case 5:
	                        System.out.println("Enter Age group limits that you want patient details");
	                        int start=sc.nextInt();
	                        int end=sc.nextInt();
	                        dao.searchPatientByAgeGroup(start,end);
	                        break;
	                    case 6:
	                        System.out.println("Enter patient id to mark as recovered");
	                        int id2=sc.nextInt();
	                        dao.markPatientRecoveryById(id2);
	                        break;
	                    case 7:
	                        System.out.println("Enter patient id to delete");
	                        int id3=sc.nextInt();
	                        dao.deletePatientById(id3);
	                        break;
	                    default:
	                        ch=false;
	                        break;
	                    }
	                    }
	                }
	                catch(Exception e)
	                {
	                        e.printStackTrace();
	                }
	            }
	}
	
