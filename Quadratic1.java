//wap to print quadratic equation
//scanner class
import java.util.Scanner;
//main class
class Quadratic1 {
  //main method
    public static void main(String args[]) {
      //data types
      int a,b,c,result;
      //creating an object
      Scanner s=new Scanner(System.in);
      System.out.println("enter a value:");
      a=s.nextInt();
      System.out.println("enter b value:");
      b=s.nextInt();
      System.out.println("enter c value:");
      c=s.nextInt();
      result=(b*b)-4*a*c;
      //print result
      System.out.println(result);
      

      
    }
  }