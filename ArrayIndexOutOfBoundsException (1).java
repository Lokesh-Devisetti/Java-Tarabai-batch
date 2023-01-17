/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException {
//main method
    public static void main(String args[]) {
        //using the scanner class to take the input from user
        Scanner sc=new Scanner(System.in);
        //to the input from user
        System.out.println("Enter the no of elements: ");
        int n=sc.nextInt();
        //storing input in array
        int arr[]=new int[n];
      
        //take the elemens as input from user
        System.out.println("Enter the Elements: ");
        //using for loop to take input
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
      //ArrayIndexOutOfBounds Exception
      try{
      for(int i=0;i<=arr.length;i++){
        System.out.println(arr[i]);
      }
      
  

  }
      catch(Exception e){
        System.out.println(e);
      }
      System.out.println("Exception occur");
    }
}
