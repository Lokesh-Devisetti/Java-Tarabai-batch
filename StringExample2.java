import java.util.*;
class StringExample2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String str=sc.next();
    for(int i=0;i<str.length();i++){
      if((str.charAt(i)>='a')&&(str.charAt(i)<='z')){
        System.out.print(str.charAt(i));
      }
    }
    System.out.println();
    for(int i=0;i<str.length();i++){
      if((str.charAt(i)>='0')&&(str.charAt(i)<='9')){
        System.out.print(str.charAt(i));
      }
    }
  }
}