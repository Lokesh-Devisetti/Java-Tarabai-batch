import java.util.Scanner;
//creating class
public class Positive1
  {
    //main method
    public static void main(String args[])
    {
      int num;
      System.out.println("enter number");
      //scanner class
      Scanner q=new Scanner(System.in);
       num=q.nextInt();
      //if statement
      if(num>0)
        System.out.println("positive number");
      else if(num<0)
        System.out.println("negative");
      else
        System.out.println("zero");
        

    }
  }


