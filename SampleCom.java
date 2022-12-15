/*Write a Java program to compare two array lists*/
import java.util.*;  
public class SampleCom
{  
public static void main(String args[])  
{  
//first array list  
ArrayList<String> firstList=new ArrayList<String>();  
firstList.add("Apple");  
firstList.add("Pears");  
firstList.add("Guava");  
firstList.add("Mango");  
System.out.println(firstList); 
List<String> secondList=new ArrayList<String>();  

secondList.add("Apple");  
secondList.add("Pears");  
secondList.add("Guava");  
secondList.add("Mango");  
System.out.println(secondList);  

boolean boolval = firstList.equals(secondList);
System.out.println(boolval);   
secondList.add("Papaya");   
  System.out.println(secondList);
boolean bool = firstList.equals(secondList);   
System.out.println(bool);  
}  
}  
