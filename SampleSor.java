/*Write a Java program to sort a given array list*/
import java.util.*;
class SampleSor{
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("HTML");
    list.add("JavaScript");
    list.add("SQL");
   System.out.println("before sorting " + list);
   Collections.sort(list);
    System.out.println("the list after sorting"+list);
  }
}