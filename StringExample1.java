/*lalitha
  for
  length of the string
s[i]=='a'||s[i]=='e'||*/
import java.util.*;
class StringExample1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String str=sc.next();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        System.out.println("vowels are:"+str.charAt(i));
      }
    }
  }
}