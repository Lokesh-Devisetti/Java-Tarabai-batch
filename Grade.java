/*5 subjects marks
  percentage 

  diplay student grade
  per 90 to 100 --A
  per 80 to 90--B
  per 70 to 80--C
  per 60 to 70--D
  fails*/
import java.util.*;
class Grade {
public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the subject1 marks:");
  int sub1=sc.nextInt();
  System.out.println("enter the subject2 marks:");
  int sub2=sc.nextInt();
  System.out.println("enter the subject3 marks:");
  int sub3=sc.nextInt();
  System.out.println("enter the subject4 marks:");
  int sub4=sc.nextInt();
  System.out.println("enter the subject5 marks:");
  int sub5=sc.nextInt();
  int total=sub1+sub2+sub3+sub4+sub5;
  int avg=total/5;
  int percentage=((total/500)*100);
  if(avg>=90 && avg<100)
    System.out.println("Grade A");
  else if(avg>=80 && avg<90)
    System.out.println("Grade B");
  else if(avg>=70 && avg<80)
    System.out.println("Grade C");
  else if(avg>=60 && avg<70)
    System.out.println("Grade D");
  else if(avg>=50 && avg<60)
    System.out.println("Grade E");
  else
    System.out.println("Grade F");
}
}