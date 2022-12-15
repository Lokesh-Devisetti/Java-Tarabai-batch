/*Write a Java program to update specific array element by given element.*/
import java.util.*;

public class SampleUpd {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
      // update element
      list.set(1,18);
        
     
      for (Integer number : list) {
         System.out.println(number);
      }  
   }
}   