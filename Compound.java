//wap to find compound interest
class Compound
{
   public static void main (String args[])
  {
      double principle, rate, time, compound_interest;
      principle = 16000;
      rate = 8;
      time = 5;
      System.out.println("The Principle amount is"+principle);
       System.out.println("The interest rate is:"+rate);
    System.out.println("The time period is:"+time);
      compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
      System.out.println("\nThe Compound Interest is: " + compound_interest);
   }
}