/*Write a Java program to retrieve an element (at a specified index) from a given array list.*/
import java.util.*;

public class SampleRetr {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
      // retrive element second index
  System.out.println(list.get(2));
     
   }
}   