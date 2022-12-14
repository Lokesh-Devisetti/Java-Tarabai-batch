/*Best Programmer
 
Baldwin High School's Best Programmer Contest is organized today and the contest hones the students coding skills by making them solve different challenges. Based on the speed and accuracy with which the students finish the challenges, the Event coordinators will rank the participants and reward them.
 
The entry level challenge was just one problem which the students has to program for. The problem reads like:
 
A positive integer, n, is said to be perfect  if the sum of its proper divisors equals the number itself. (Proper divisors include 1 but not the number itself.) If this sum is less than n, the number is deficient, and if the sum is greater than n, the number is abundant.
 
The Event coordinators wanted to prepare the answer key for all the problems given in the contest so as to evaluate the submissions of the participants.
 
Hence create a class named NumberType with the following method.
 

Method Name
Description

int findType(int)
This method return 1 if the given integer is a deficient number, return 0 if it is a perfect number and return -1 if it is a abundant number.

 
Create a driver class called Main. In the Main method, obtain input from the user in the console and display the number along with its classification by calling the findType method present in the NumberType class.
 
[Note: Strictly adhere to the Object Oriented Specifications given in the problem statement.
All class names, attribute names and method names should be the same as specified in the problem statement. Create separate classes in separate files.]]
 
Input Format:
The input consists of an integer that corresponds to the given number.
 
Output Format:
Output should display if the given number is a perfect, abundant or deficient number.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
4
 
Sample Output 1:
4 is a deficient number
 
Sample Input 2:
6
 
Sample Output 2:
6 is a perfect number
 
Sample Input 3:
12
 
Sample Output 3:
12 is an abundant number*/
import java.util.*;
class NumberType
  {
    public static int findType(int n){
      int sum=0;
      for(int i=1;i<=n/2;i++){
        if(n%i==0){
          sum=sum+i;
        }
        
      }
     
      if (sum==n){
        return 1;
      }
      else if(sum>n){
        return 0;
      }
      else{
        return -1;
      }
    }
  }
public class DataTypesExample {
   public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
    int result= NumberType.findType(num);
     if(result==1){
       System.out.println("perfect number");
     }
     else if(result==0){
         System.out.println("defecient number");
     }
     else{
         System.out.println("abundent number");
     }
     
   }
}