//check whether character is alphabet or not
//package
import java.util.*;
//creating a class
public class Alphabet
{
  //main method
    public static void main(String args[])
    {
      //creating an object using scanner class
        Scanner s=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character ");
        ch=s.next().charAt(0);
      //condition
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
          //print result
        System.out.println(ch+" is an alphabet");
        else
        System.out.println(ch+" is not an alphabet");
    }
}