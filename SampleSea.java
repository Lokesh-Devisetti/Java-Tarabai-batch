/*Write a Java program to search an element in a array list*/
import java.util.*;

public class SampleSea {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
      // update element
     if(list.contains(15)){
       System.out.println("element found");
     }
  else{
    System.out.println("element not found");
  }
      
   }
}   