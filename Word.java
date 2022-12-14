import java.util.*;
class Word{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter paragraph");
    String str=sc.nextLine();
    String str1[]=str.split(" ");
    for(int i=0;i<str1.length;i++){
      if(str1[i].length()==3){
        System.out.println(str1[i]);
      }
    }
  }
}