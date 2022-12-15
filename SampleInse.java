/*Write a Java program to insert an element into the array list at the first position*/
import java.util.*;

public class SampleInse {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
      // adding element 25 at first position
      list.add(0,25);
        
     
      for (Integer number : list) {
         System.out.println(number);
      }  
   }
}   