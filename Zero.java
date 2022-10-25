// number is zero or not
//package
import java.util.*;
//create a main class
class Zero {
  //main method
   public static void main(String args[]) {
     //creating an object by using scanner class
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number:");
     int num=sc.nextInt();
     //condition
     if(num==0)
       //print result
     System.out.println(num+" is a zero ");
     else 
       System.out.println(num+" it is not a zero");
     
   }
}