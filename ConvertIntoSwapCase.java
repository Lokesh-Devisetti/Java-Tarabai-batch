/* 3. Write a Java program to read data from input file and convert all the characters into swap case then 
      write into output file using FileInputStream and FileOutputStream classes.

      Sample Input: Create text file and write some data to the file. 
      Sample Data: "Hi, This is Sample data"
      Expected Output: hI,tHIS IS sAMPLE DATA

*/
import java.io.*;
public class ConvertIntoSwapCase {
public static void main(String args[]) throws IOException{
FileInputStream fis=new FileInputStream("input.txt");
    int c;
    String str="";
    
    while((c=fis.read())!=-1){
      
      str=str+(char)c;
    }
      System.out.println(str);
 
    String [] arr=str.split(" ");
    
    for(int i=0;i<arr.length;i++){
      
      char [] ch=arr[i].toCharArray();  
      
      for(int j=0;j<ch.length;j++){
        char a=ch[j];
        if(Character.isUpperCase(a)){
          char b=Character.toLowerCase(a);
          System.out.print(b);
        }
        else if(Character.isLowerCase(a)){
          char b=Character.toUpperCase(a);
          System.out.print(b);
        }
        else{
          System.out.print(a);
        }
      }
}
}
}