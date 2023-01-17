/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/
import java.io.*;
public class StudentDetails {
public static void main(String args[]) throws IOException{
    BufferedWriter br=new BufferedWriter(new FileWriter("studentdata.txt"));
  br.write("Ramu,60");
    br.newLine();
    br.write("Kumar,56");
  br.newLine();
  br.write("Rakesh,89");
  br.newLine();
  br.write("Suresh,66");
  br.newLine();
  br.write("lokesh,90");
  
    br.close();
    BufferedReader rd=new BufferedReader(new FileReader("studentdata.txt"));
    String str;
  int topMarks=0;
      String topStudentName = "";
    while((str=rd.readLine())!=null){
      
    String[] words=str.split(",");
       System.out.println("Student-name:"+words[0]);
       System.out.println("Student-marks:"+words[1]);
      String name =words[0];
       int marks = Integer.parseInt(words[1]);

        if (marks > topMarks) {
          topMarks = marks;
          topStudentName = name;
        }
      }
     System.out.println("Student with top marks: " + topStudentName + " (" + topMarks + ")");
        }
}
