//person is eigible for vote or not
//package
import java.util.*;
//create a main class
class Vote {
  //declare a main method
  public static void main(String args[]) {
    //create an object using scanner class
    Scanner s=new Scanner(System.in);
    System.out.println("enter age:");
    int age=s.nextInt();
    //condition
    if(age>18)
      //print result
      System.out.println("eligible for vote");
    else
    //print result
      System.out.println("not eligible for vote");
 }
  
}