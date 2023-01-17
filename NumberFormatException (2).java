/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

import java.util.*;
public class NumberFormatException {
    // create a method and set parameters
    public void Test(String x, String y) {
        int a=Integer.parseInt(x);
        int b=Integer.parseInt(y);
      
        System.out.println(a+b);
    }
      
    // main method
    public static void main(String args[]) {
        // Use scanner class to take input from user 
        Scanner s= new Scanner(System.in);
        // Take input from user
        System.out.println("Enter two digits: ");
        String p=s.next();
        String q=s.next();
        // Create object
        NumberFormatException obj=new NumberFormatException();
        // Calling method
      try{
      obj.Test(p,q);
      }
      catch(Exception e){
        System.out.println(e);
        System.out.println(e.getMessage());
      }
        System.out.println("Exception handled");
    }
      
    }
