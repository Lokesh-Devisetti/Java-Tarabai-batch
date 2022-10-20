import java.util.Scanner;
class Peritri
  {
    public static void main(String args[])
    {
      int a,b,c,peri;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      a=sc.nextInt();
      System.out.println("enter b value");
      b=sc.nextInt();
      System.out.println("enter c value");
      c=sc.nextInt();
      peri=a+b+c;;
      System.out.println("perimeter of square:"+peri);
    }
  }