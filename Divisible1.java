 // number is divisible by 5 and 3 or not
//package
import java.util.Scanner;
//create a main class
class Divisible1{
  //declare a main method
public static void main(String args[])
{
  //creating an object using scanner class
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
  //condition
if( num%5==0 && num%3==0)
  //print result
System.out.println(num+" is divisible by 5 and 3");
else
System.out.println(num+" is not divisible by 5 and 3");
}
}
