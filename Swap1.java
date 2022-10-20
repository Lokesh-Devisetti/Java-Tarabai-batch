//wap to swap 2 numbers without using third variable
import java.util.Scanner;
class Swap1 {
  public static void main(String args[]) {
    int a, b;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a value:");
    a=s.nextInt();
    System.out.println("enter b value:");
    b=s.nextInt();
    System.out.println("before a swapping:"+a);
    System.out.println("before b swapping:"+b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("after a swapping:"+a);
    System.out.println("after b swapping:"+b);
  }
}