/*Write a Java program to clone an array list to another array list.*/
import java.util.*;

public class SampleCl {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
  ArrayList<Integer> list1 =(ArrayList<Integer>)list.clone();
     System.out.println(list1);
   }
}   