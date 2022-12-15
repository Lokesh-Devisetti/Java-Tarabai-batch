/*Write a Java program to replace the second element of a ArrayList with the specified element*/
import java.util.*;
class SampleSpe{
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("HTML");
    list.add("JavaScript");
    list.add("SQL");
   System.out.println("before  " + list);
    String str="C++";
    list.set(1,str);

  int num=list.size();
  System.out.println("Replace second element with C++."); 
  for(int i=0;i<num;i++)
  System.out.println(list.get(i));
   
  }
}