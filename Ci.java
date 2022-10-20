//wap to find compound interest
import java.util.Scanner;
class Ci
{
   public static void main (String args[])
  {
    double principle, rate, time, compound_interest;
    Scanner sc=new Scanner(System.in);
    System.out.println("The Principle amount is");
    principle=sc.nextDouble();
    System.out.println("The interest rate is:");
    rate=sc.nextDouble();
    System.out.println("The time period is:");
    time=sc.nextDouble();
    compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
      System.out.println("\nThe Compound Interest is: " + compound_interest);
   }
}