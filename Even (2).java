//write a java program given number is even or not
import java.util.Scanner;
class Even {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int num=sc.nextInt();
    if(num%2==0)
      System.out.println(num+" is a even number");
    else
      System.out.println(num+" it is not a even number");
  }
}