/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA.  
      DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
      After printing gross salary display user defined message once object got garbage collected.

      Sample Input:
      Enter Basic salary: 23000
      
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/
import java.util.*;
public class GrossSalary {
  private int basicsalary;
  
  GrossSalary(int basicsalary){
    this.basicsalary=basicsalary;
    
  }
  public void setBasicSalary(int basicsalary){
    this.basicsalary=basicsalary;
  }
 
  public int getBasicSalary(){
    return basicsalary;
  }
  public void displayGrossSalary(){
    int da=(82*basicsalary)/100;
      int hra=(70*basicsalary)/100;
      int gross=basicsalary+da+hra;
    System.out.println("Your gross salary is:"+gross);
  }
  public void finalize(){
    System.out.println("Object is garbage collected");
  }
    public static void main(String[ ] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter basic salary");
      int basic=sc.nextInt();
    GrossSalary gs=new GrossSalary(basic);
      gs.displayGrossSalary();
      
      gs=null;
      System.gc();
    }
}
