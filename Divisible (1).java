//check whether number is divisble by 5 or not
//package
import java.util.*;
//class name
public class Divisible
{
  //main method
    public static void main(String args[])
    {
      //creating an object
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check it is divisible by 5 ");
      //datatypes
        int number=sc.nextInt();
      //condition
        if(number%5==0)
        {
          //print result
            System.out.println("Given number "+ number + " is Divisible by 5 ");
        } 
        else
        {
            System.out.println("Given number "+ number + " is Not Divisible by 5 ");
        }
    }
}