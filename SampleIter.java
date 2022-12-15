/*Write a Java program to iterate through all elements in a array list*/
import java.util.*;
class SampleIter{
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("HTML");
    list.add("JavaScript");
    list.add("SQL");
   System.out.println("ArrayList: " + list);
    System.out.println("Iterating over ArrayList using for-each loop:");
    for(String language : list) {
      System.out.print(language+" , ");
     
    }
  }
}
