/* 3. Write a Java program to find the longest word and smallest word in a text file.

    Sample Input: Create text file and write some data to the file. 
    Sample Data: "Welcome to bitLabs"

    Expected Output: 
    Longest word: Welcome
    Smallest word: to
*/
import java.io.*;
import java.util.*;
 
public class FindingLongestSmallestWord {
public static void main(String args[]) throws IOException{
FileReader fis1 = new FileReader("welcome.txt"); // Charcter stream
BufferedReader br = new BufferedReader(fis1);
    String str;
    String[] arr = new String[50];
    ArrayList<String> al = new ArrayList<String>();
    while ((str = br.readLine()) != null) {
      //System.out.println(str);
      arr = str.split(" ");
      Collections.addAll(al, arr);
    }
  String longest="";
  String smallest="";
  int min=20;
    int max=0;
    
    int [] fre=new int[al.size()];
    
    for (int i = 0; i < arr.length; i++) {
      int a=arr[i].length();
        if(a>max){
          max=a;
          longest=arr[i];
        }
        else if(a<min){
          min=a;
          smallest=arr[i];
        }
      }
     System.out.println("Longest word:"+longest);
    System.out.println("Shortest word:"+smallest);
  }
}