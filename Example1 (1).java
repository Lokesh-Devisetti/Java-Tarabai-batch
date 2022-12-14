/*We have already used equals() method many times. Now we are gonna use it again to check for some mishappenings in our application. Assume if 2 users are entering addresses in their respective profile and we don't want them to enter the same address by mistake. So write a program to show "RED" is the address entered are same and so on. Refer output format for further details.
 
Input Format:
The first line input corresponds to the address 1.
The second line input corresponds to the address 2.
Refer sample input for formatting specifications.
 
Output Format:
The output consists of string.It displays
RED - If two addresses are same.
YELLOW - If two addresses are same but the mismatch in spaces.
BLUE - If two address are same but the mismatch in cases.
GREEN - If two addresses are different.
Refer sample output for formatting specifications.*/
import java.util.*;
class Example1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("The first line input corresponds to the address 1.");
    String str=sc.nextLine();
    System.out.println("The second line input corresponds to the address 2.");
    String str1=sc.nextLine();
    if(str.equals(str1)){
      System.out.println("RED");
    }
    else if(str.replace(" ","").equals(str1.replace(" ",""))){
      System.out.println("YELLOW");
    }
    else if(str.equalsIgnoreCase(str1)){
      System.out.println("BLUE");
    }
    else{
      System.out.println("GREEN");
    }
  }
}