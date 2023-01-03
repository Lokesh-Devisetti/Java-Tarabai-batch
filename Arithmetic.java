import java.util.*;

 

public class Arithmetic{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number");
    int n1 = sc.nextInt();
    System.out.println("enter second number");
    int n2 = sc.nextInt();
    System.out.println("enter operator (+, -, *, /)");
    char ch = sc.next().charAt(0);
    int result = 0;
    switch (ch) {
      case '+':
        System.out.println("addition");
        result = n1 + n2;
        break;
      case '-':
        System.out.println("subtraction");
        result = n1 - n2;
        break;
      case '*':
        System.out.println("Multiplicaion");
        result = n1 * n2;
        break;
      case '/':      
        try{
          result=n1/n2;
         
        }
        catch(Exception e){
          System.out.println(e);         
        }
         System.out.println(result);
        break;
      default:
        System.out.println("Invalid");
    }
 //   System.out.println(result);;
  }
}