//when a person eligible for blood donation are not
//age > 18 and weight >50

  //package  
import java.util.Scanner;
//create a main class
class Blood{
  //main method
public static void main(String args[])
  {
    //creating an object by using scanner class
Scanner sc=new Scanner(System.in);
System.out.println("enter a age");
int age=sc.nextInt();
System.out.println("enter Weight");
int weight=sc.nextInt();
if(age>18 && weight>50)
System.out.println("Eligible for blood donation");
else
System.out.println("Not eleigible for blood donation");
}
}
