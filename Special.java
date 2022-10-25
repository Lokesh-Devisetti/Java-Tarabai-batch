//Write a JAVA program to input any character and check whether it is alphabet, digit    or special character.
import java.util.Scanner;
class Special {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character:");
    char ch=sc.next().charAt(0);
    if((ch>='A' && ch<'Z')||(ch>='a' && ch <'z'))
      System.out.println(ch+" is is a alphabet");
    else if(ch>='0' && ch<'9')
      System.out.println(ch+" it is a digit");
    else
      System.out.println(ch+" it is a special character");
  }
}