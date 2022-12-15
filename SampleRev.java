/*Write a Java program to reverse elements in a array list.*/
import java.util.*;

public class SampleRev{
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(15);
      list.add(22);
      list.add(30);
      list.add(40);
      System.out.print(list);
  System.out.println();
Collections.reverse(list);
  System.out.println(list);
}
  
  
}   
