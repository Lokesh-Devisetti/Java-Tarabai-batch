/*Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of academic subjects. This week’s competition was a Team event and students who register for the event will be given a unique registration code N. The participants are teamed into 10 teams and the team to which a participant is assigned to depends on the absolute difference between the first and last digit in the registration code.
 
The event organizers wanted your help in writing an automated program that will ease their job of assigning teams to the participants. If the registration number given is less than 10, then the program should display "Invalid Input".
 
Input Format:
The only line of input contains an integer N.
 
Output Format:
Output the absolute difference between the first and last digit of N.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
345
 
Sample Output 1:
2
 
Sample Input 2:
9
Sample Output 2:
Invalid Input*/
import java.util.*;
class Quiz{
  public static void main(String args[]){
    int n,s,g,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    n=sc.nextInt();
    int arr[]=new int[10];
    if(n/10==0){//456
      System.out.println("Invalid Input");
    }
    else{
    for( i=0;n>0;i++){//456>0,45>0,4>0
      s=n%10;//456%10=6,45%10=5,4%10=0
      n=n/10;//456/10=45,45/10=4,4/10=0
      arr[i]=s;//arr[0]=6,arr[1]=4,arr[2]=0
    }
    
    g=(arr[0]-arr[i-1]);//6-4
    System.out.println(g);
  }
}
}