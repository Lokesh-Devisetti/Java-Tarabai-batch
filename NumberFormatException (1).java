/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
public class NumberFormatException {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
     String firstname=sc.next();
      String lastname=sc.next();
      String mobilenumber=sc.next();
      int fcount=0;
      int lcount=0;
      long sum=0;
      for(int i=0;i<firstname.length();i++){
        if(firstname.charAt(i)!=' ')
          fcount++;
      }
      System.out.println("number of characters:"+fcount);
      for(int i=0;i<lastname.length();i++){
        if(lastname.charAt(i)!=' ')
          lcount++;
      }
      
      System.out.println("number of characters:"+lcount);
      //NumberFormatException
      long m=Long.parseLong(mobilenumber);
      long num;
    
        try{
        
        while(m!=0){//7013840036
          num=m%10;//
          sum=sum+num;
          m=m/10;
          
        }
        }
        catch(Exception e){
          System.out.println(e);
        }
        
      
      System.out.println("sum of mobilenumber"+sum);
        
    }
}