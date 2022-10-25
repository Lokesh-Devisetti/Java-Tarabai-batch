// number is positive numer or not
//package
import java.util.*;
//create a main class
class Positive {
  //main method
   public static void main(String args[]) {
     //creating an object by using scanner class
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number:");
     int num=sc.nextInt();
     //condition
     if(num>0)
       //print result
     System.out.println(num+" is a positive number");
     else 
       System.out.println(num+" it is not a positive number");
     
   }
}