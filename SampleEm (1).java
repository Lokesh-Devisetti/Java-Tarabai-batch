/*Write a Java program to empty an array list.*/
import java.util.*;
public class SampleEm {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.println(list);
  list.removeAll(list);
  System.out.println(list);
   }
}   