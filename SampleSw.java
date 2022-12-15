/*Write a Java program of swap two elements in an array list.*/
import java.util.*;

public class SampleSw{
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
Collections.swap(list,1,3);
  System.out.println(list);
}
  
  
}   
