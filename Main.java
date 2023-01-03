/*Create a class Main and in the main method get the usernames and store them in an ArrayList. After getting all the names, just display them in the same order.*/
import java.util.*;
class Main{
  public static void main(String args[]){
    ArrayList<String> list=new ArrayList();
    char choice;
    Scanner sc=new Scanner(System.in);
    String str;
    do{
      System.out.println("enter username");
     str=sc.next();
      list.add(str);
      System.out.println("do you want one more username");
      choice=sc.next().charAt(0);
    }while(choice=='y');
    System.out.println("using for each loop");
    for(String i:list){
          System.out.println(i);
    }
  }
}
  