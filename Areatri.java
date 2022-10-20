import java.util.Scanner;
class Areatri
  {
    public static void main(String args[])
    {
      double b,h,area;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter breadth value");
      b=sc.nextDouble();
      System.out.println("enter height value");
      h=sc.nextDouble();
    area=(b*h)/2;
      System.out.println("area of triangle:"+area);
    }
  }