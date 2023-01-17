/* 2. Write a program to create a Thread by extending from Thread class. Override run() method and in run() 
      method accept number of seconds from user and display countdown time. 
      
      Sample Input: 
      Enter Number of seconds: 60

      Expected Output:
      59 seconds to go..
      58 seconds to go..
      57 seconds to go..
      56 seconds to go..
*/
import java.util.*;
class Time extends Thread{
  public void run(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of seconds:");
    int n=sc.nextInt();
    
    for(int i=n;i>0;i--){
      System.out.println(i+" seconds to go..");
    }
  }
}
public class OverrideThread  {

	public static void main(String args[]) {
	Time t1=new Time();
    t1.start();
	}
}

