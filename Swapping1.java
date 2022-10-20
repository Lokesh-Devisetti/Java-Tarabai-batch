//wap to swap 2 numbers with using third variable
import java.util.Scanner;
//creating class
class Swapping1 {
  //main method
  public static void main(String args[]) {
    int a, b, temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value:");
    a=sc.nextInt();
    System.out.println("enter b value:");
    b=sc.nextInt();
    System.out.println("before a swapping:"+a);
    System.out.println("before b swapping:"+b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("after a swapping:"+a);
    System.out.println("after b swapping:"+b);

  }
}