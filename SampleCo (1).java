/*Write a Java program to copy one array list into another.*/
import java.util.*;
class SampleCo{
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("HTML");
    list.add("JavaScript");
    list.add("SQL");
   System.out.println("first list " + list);
    ArrayList<String> list2 = new ArrayList<>();
   list2.addAll(list);
    //Collections.copy(list, list2);
    Iterator itr = list2.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
  
  }
}
