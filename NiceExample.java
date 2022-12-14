/*Nice Number
 
" The Greatest Furniture Expo" is a biggest fair exhibiting furniture products, services and equipment, interior services, decoration plans, modular kitchen accessories, bedroom furniture, stylish sittings etc in the Furniture industry. It is a 4-day event and on the inaugural day of the event, the Event coordinators have announced for a Lucky lottery contest.
 
According to the Lucky lottery, the visitors’ entry tickets are collected and the visitors whose ticket numbers are nice numbers are chosen as winners and attractive discount coupons are distributed to the winners. A nice number is a positive integer which has exactly 4 divisors.
 
The Event coordinators wanted to know if a specific’s entry ticket number is a nice number or not.
 
Hence create a class named NiceNumber with the following method.
 

Method Name
Description

int findType(int)
This method return 1 if the number is nice or return 0 if it is not a nice number.

 
Create a driver class called Main. In the Main method, obtain input from the user in the console and display "Nice" if the given ticket number is a nice number. Print "Not Nice" otherwise by calling the findType method present in NiceNumber class.
 
[Note: Strictly adhere to the Object Oriented Specifications given in the problem statement.
All class names, attribute names and method names should be the same as specified in the problem statement. Create separate classes in separate files.]
 
Input Format:
First line of the input is an integer that corresponds to the entry ticket number of a visitor.
 
Output format:
Output should display "Nice"(without quotes) if the given ticket number is a nice number. Print "Not Nice"(without quotes) otherwise.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
6
 
Sample Output 1:
Nice
 
Sample Input 2:
4 
Sample Output 2:
Not Nice*/ 
import java.util.*;
 class NiceNumber{
    public static int findType (int n)
    { 
        int count=0;
    for(int i=2;i<=n/2;i++)//1<=3,2<=3
    {
        if(n%i==0)//3%1==0,3%2
        {
            count++;//1
        }
    }
    if(count==2)
    {
        return 1;
    }
    else 
    
        return 0;
 
}
}
class NiceExample{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int result=NiceNumber.findType(num);
    if(result==1){
      System.out.println("nice");

    }
    else{
      System.out.println("not nice");
    }
  }
}