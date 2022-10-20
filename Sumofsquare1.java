//wap to print sum of squares of 2 numbers
import java.util.Scanner;
class Sumofsquare1 {
  public static void main(String args[]) {
    int x, y, sum, sum_square;
   Scanner s=new Scanner(System.in);
    System.out.println("enter x value:");
    x=s.nextInt();
    System.out.println("enter y value:");
    y=s.nextInt();
    sum = x + y;
    sum_square = sum * sum;
    System.out.println("the sum of Square of two number is " + sum_square);
  }
}