/* 2. Write a Java program to read data from input file and convert into uppercase then write data into 
      output file using FileInputStream and FileOutputStream classes. Handle IOException while reading and writing data.

      Sample Input:Create text file and write some data to the file.
      Sample Data: "Hi, this is Sample data"

      Expected Output: HI, THIS IS SAMPLE DATA
*/
 import java.io.*;
public class ConvertIntoUpperCase {
public static void main(String args[]) throws IOException{
FileInputStream fis=new FileInputStream("input.txt");
    int c;
    String str="";
    String str2="";
    while((c=fis.read())!=-1){
      
      str=str+(char)c;
    }
      System.out.println(str);
 
    String [] arr=str.split(" ");
    
    for(int i=0;i<arr.length;i++){
      
      char [] ch=arr[i].toCharArray();  
      
      for(int j=0;j<ch.length;j++){
          char d = Character.toUpperCase(ch[j]);
           str2=str2+d;  
      }
      str2=str2+" ";
    }
    System.out.println(str2);
    FileOutputStream fout=new FileOutputStream("output.txt");
   char ch[] = str2.toCharArray();
        for (int i = 0; i < str2.length(); i++) {
          
            fout.write(ch[i]);
        }
    
  }
}
