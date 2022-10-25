/*"FantasyKingdom" is a brand new Amusement park that is going to be inaugurated shortly in the City and is promoted as the place for breath-taking charm. 
The theme park has more than 30 exhilarating and craziest rides and as a special feature of the park, the park Authorities has placed many Ticketing Kiosks 
at the entrance which would facilitate the public to purchase their entrance tickets and ride tickets.
 
The Entrance Tickets are to be issued typically based on age, as there are different fare for different age groups. 
There are 2 types of tickets – Child ticket and Adult ticket. If the age given is less than 15, then Child ticket is issued whereas for age greater than equal to 15, Adult ticket is issued. Write a piece of code to program this requirement in the ticketing kiosks.
 
Input Format:
First line of the input is an integer that corresponds to the age of the person.
 
Output Format:
Output should display "Child Ticket" or "Adult Ticket" based on the conditions given.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
20
 
Sample Output 1:
Adult Ticket
 
Sample Input 2:
12
 
Sample Output 2:
Child Ticket*/
import java.util.Scanner;
class Ticket1 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    //System.out.println("enter age");
    int age=sc.nextInt();
    if(age>15){
      System.out.println("Adult Ticket");
    }
    else {
      System.out.println("Child Ticket");
      }
  }
}