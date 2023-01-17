/*1. Write a program to create a new Thread by extending from Thread class, read data from studentdetails.txt 
     file using child Thread and read data from employee.txt file using main Thread. And print student details 
     first then employee details. Use join method to achieve this task. Before running this program create following files 
     • Create StudentDetails.txt file and enter 3 students’ information such as name, marks, college_name 
     • Create employee.txt and enter 3 employees’ information such as name, salary and department_name.*/
import java.io.*;
class Details extends Thread{
  public void run(){
    try{
  
    FileReader fr=new FileReader("StudentDetails.txt");
    BufferedReader br=new BufferedReader(fr);
    String str;
    while((str=br.readLine())!=null){
      System.out.println(str);
    }
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
    }
  }

public class CreateThread  {

	public static void main(String args[]) throws IOException{
    Details de=new Details();
    de.start();
    
  try{
    de.join();
  }
    catch(InterruptedException e){
      System.out.println(e.getMessage());
    }
	FileReader fr=new FileReader("employee.txt");
    BufferedReader br=new BufferedReader(fr);
    String str;
    while((str=br.readLine())!=null){
      System.out.println(str);
    
	}
}
}