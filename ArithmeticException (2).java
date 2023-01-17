/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException {
// creating a the method
    public void method(int a, int b) {
      //ArithmeticException
      try{
         System.out.println(a/b);
      }
       catch(Exception e){
         System.out.println(e);
       }
      System.out.println("Exception handled");
    }
    public static void main(String args[]) {
        //create object
        ArithmeticException obj=new ArithmeticException();
        //calling the method and initializing
        obj.method(50,0);
        //During the run time it throws the exceptions because the digits 50 cannot be divided by 0
    }
}

