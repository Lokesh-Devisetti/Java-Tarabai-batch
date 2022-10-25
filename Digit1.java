//check whether character is digit or not
//package
import java.util.Scanner;
//class name
public class Digit1
  {
    //main method
    public static void main(String[] args) 
    {
      //creating an object using scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit: ");
        char num=scanner.next().charAt(0);
      //condition
        if(num >= '0')
        {
          if(num <'9')
          {
         System.out.println(num + " is a digit");
        }
        
        else 
        {
          System.out.println(num + " not a digit");
        }
        }
    }
  }
    
