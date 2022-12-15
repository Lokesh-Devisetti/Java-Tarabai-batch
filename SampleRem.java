/*Write a Java program to remove the third element from a array list.*/
import java.util.*;

public class SampleRem {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.print(list);
  System.out.println();
      // remove  in third element
      list.remove(2);
        
     
      for (Integer number : list) {
         System.out.println(number);
      }  
   }
}   