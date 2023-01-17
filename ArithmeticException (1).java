/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
public class ArithmeticException {

    public static void main(String args[]) {
       int num1,num2;
      Scanner sc=new Scanner(System.in);
      num1=sc.nextInt();
      num2=sc.nextInt();
      int ch;
      ch=sc.next().charAt(0);
      switch(ch){
          
        case '+':
          
          System.out.println("Addition of two numbers"+(num1+num2));
          break;
        case '-':
          
          System.out.println("substraction of two numbers"+(num1-num2));
          break;
        case '*':
          
          System.out.println("multiplication of two numbers"+ (num1*num2));
          break;
        case '/':
          //arithmeticException
          try{
             
            System.out.println("division of two numbers"+(num1/num2));
          }
          catch(Exception e){
            System.out.println(e);
          }
          System.out.println("error is handled");
          break;
        default:
          System.out.println("please write numbers only");
      }
    }
}