/*problem statement
gross salary:
basicsalary+HRA+DA
basic salary:20000
hra:12% on basic salary------20000*12/100=2400
DA :20% on basic salary------20000*20/100=4000
gs=20000+2400+4000*/
//package
import java.util.Scanner;
//create a main class
class Gross {
  //main method
 public static void main(String args[])  {
  float Basic_salary,DA,HRA,da1,hra1,GrossSalary;
   //creating an object
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Basic Salary Of Employee: ");
  Basic_salary=scan.nextFloat();
  System.out.println("Enter Basic DA Of Employee: "); 
  da1=scan.nextFloat();
  System.out.println("Enter Basic HRA Of Employee: ");
  hra1=scan.nextFloat();
   //formual for da and hra
  DA=(da1*Basic_salary)/100;
  HRA=(hra1*Basic_salary)/100;
   //grosssalary formula
  GrossSalary=Basic_salary+DA+HRA;
  System.out.println("Gross Salary Of Employee: "+GrossSalary);
  }
}