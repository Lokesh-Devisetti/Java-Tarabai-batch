/*Write a Java program to increase the size of an array list*/
import java.util.*;

public class SampleInc{
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.println(list);
  System.out.println(list.size());
      list.ensureCapacity(15);
  list.add(4);
  list.add(8);
  System.out.println(list.size());
   }
}   