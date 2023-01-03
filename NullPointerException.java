import java.util.*;
class NullPointerException{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    try{
      System.out.println(str.length());
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("exception handeld");
  }
}