/*"Fantasy Kingdom" is a brand new Amusement park that is going to be inaugurated shortly in the City and is promoted as the place for breath-taking charm. The theme park has more than 30 exhilarating and thrilling rides and as a special feature of the park, the park Authorities have placed many Booking Kiosks at the entrance which would facilitate the public to purchase their entrance tickets and ride tickets.There are few rides in the park which are not suitable for Children and aged people, hence the park Authorities wanted to program the kiosks to issue the tickets based on people’s age. If the age given is less than 15 (Children) or greater than 60 (Aged), then the system should display as "Not Allowed", otherwise it should display as "Allowed". Write a block of code to help 
the Authorities program this functionality.
 
Input Format:
First line of the input is an integer that corresponds to the age of the person opting for the ride.
 
Output Format:
Output should display "Allowed" or "Not Allowed" based on the conditions given.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
20
 
Sample Output 1:
Allowed
 
Sample Input 2:
12
 
Sample Output 2:
Not Allowed*/
import java.util.Scanner;
class Ticket2 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    //System.out.println("enter age");
    int age=sc.nextInt();
    if(age>15){
      System.out.println("Allowed");
    }
    else {
      System.out.println("Not Allowed");
      }
  }
}