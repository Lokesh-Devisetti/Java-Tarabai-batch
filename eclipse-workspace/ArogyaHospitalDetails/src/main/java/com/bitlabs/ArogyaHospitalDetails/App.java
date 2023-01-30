package com.bitlabs.ArogyaHospitalDetails;

import java.io.*;

import java.util.*;

public class App {

	public static void main(String args[]) throws IOException{
		DaoInterface d1=new DaoImpl();

		PatientInfo pt[]=new PatientInfo[3];
		Scanner sc= new Scanner(System.in);
		
		boolean ch= true;
		try {
			FileReader fr= new FileReader("PatientRecord.csv");
			BufferedReader br= new BufferedReader(fr);
			while(ch) {
				System.out.println("**********MENU***********");
				System.out.println("1.Patient Registration\n2.View All Patient\n3.Search Pateint by ID\n4.Search Patient by City\n5.Search Patient by age group\n6. Change the Recovery Status\n7. Delete the patient by id\n0. For exit  ");
				System.out.println("Enter the choice");
				int num=sc.nextInt();
				switch(num) {
				case 1:
					String str;
					while((str=br.readLine())!=null) {
						int i=0;
						pt[i]=new PatientInfo();
						String arr[]=str.split(",");
						pt[i].setName(arr[0]);
						pt[i].setGender(arr[1]);
						pt[i].setCity(arr[2]);
						if(arr[3].length()<=2) {
							pt[i].setAge(Integer.parseInt(arr[3]));
						}
						else {
							System.out.println("invalid age");
							break;
						}
						
						
						
						if(arr[4].length()==12) {
							
							pt[i].setAadharcard(Long.parseLong(arr[4]));
						}	
						else {
							System.out.println("invalid addhar card number");
							break;
						}
						if(arr[5].length()==10) {
							pt[i]. setContact(Long.parseLong(arr[5]));
						}
						else {
							System.out.println("contact number invalid");
							break;
						}
						
						
						pt[i].setAadress(arr[6]);
						pt[i].setDateofadmission(arr[7]);
						pt[i].setG_name(arr[8]);
						pt[i].setG_aadress(arr[9]);
						pt[i].setG_contact(Long.parseLong(arr[10]));
						pt[i].setRecovery(arr[11]);
						
						d1.patientRegistration(pt[i]);
						i++;
					}	
					break;
				case 2:
					System.out.println("here is all patient");
					d1.viewAllPatient();
					break;
				case 3:
					System.out.println("Enter the patient ID");
					int pId=sc.nextInt();
					d1.searchPatientById(pId);
					break;
				case 4: 
					System.out.println("Enter the city");
					String pCity= sc.next();
					d1.searchPatientByCity(pCity);
					break;
				case 5:
					System.out.println("Enter the age start and end ");
					int start=sc.nextInt();
					int end= sc.nextInt();
					d1.searchPatientByAgeGroup(start, end);
					break;
				case 6:
					System.out.println("Enter the id for recovery ");
					int rId= sc.nextInt();
					d1.markPatientRecoveryById(rId);
					break;
				case 7:
					System.out.println("Enter the id for delete the patient info");
					int dId= sc.nextInt();
					d1.deletePatientById(dId);
					break;
				default:
					ch=false;
					break;
				}
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}
}