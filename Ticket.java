/*A recently launched attraction at the "Events Square" entertainment fair is the "Carnival of Terror" which is an interactive fun zone featuring scary, horror and Halloween stories.
 
The Entry tickets for the show is to be printed with a Welcome message along with an additional message for Children stating they should be accompanied by an adult. Given the age of the person visiting the scary house, the ticket should carry the additional message only for Children whose age is less than 15 years. The show organizers wanted your help to accomplish this task. Write a program that will get age as the input and display the appropriate message on the tickets.
 
Input Format:
First line of the input is an integer that corresponds to the age of the person.
 
Output Format:
Output should display the additional message "Please note that you should be accompanied by an adult" for Children less than 15 years. Otherwise it should print only 
the Welcome message.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
20
 
Sample Output 1:
Welcome to the show
 
Sample Input 2:
14
 
Sample Output 2:
Welcome to the show
Please note that you should be accompanied by an adult*/
import java.util.Scanner;
class Ticket {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    //System.out.println("enter age");
    int age=sc.nextInt();
    if(age>15){
      System.out.println("Welcome to the show");
    }
    else {
      System.out.println("Welcome to the show");
      System.out.println("Please note that you should be accompanied by an adult");
      
    }
  }
}