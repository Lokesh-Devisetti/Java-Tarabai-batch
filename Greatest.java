//find greatest number among 2 numbers
//package
import java.util.*;
// creating class name
public class Greatest
{
  //main method
    public static void main(String args[])
    {
      //creating an object by using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter thes second number: ");
        int num2=sc.nextInt();
      //condition
        if(num1>num2)
          //print result
        System.out.println("number one is big");
        else
        System.out.println("number two is big");
    }
}