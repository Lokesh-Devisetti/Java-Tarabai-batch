/* 4. Write a java program to count the list of files based on their extension using File class. 
      Display following files count on console. 
     ==> Number of text files
     ==> Number of document files
     ==> Number of image files
     ==> Number of other files

   Sample Input: Create folder and create different files such as document, pdf, image and text files.

   Expected Output: 
    Number of text files: 5
    Number of document files: 3
    Number of image files: 4
    Number of other files: 3
*/
import java.io.*;
import java.util.*;
public class FilesCount {

    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int textcount=0,doccount=0,imagecount=0,ocount=0;
      try{
        System.out.println("Enter folder:");
        String str=sc.next();
        File fp=new File(str);
        boolean bool=fp.mkdir();
        if(bool){
          System.out.println("folder created");
        }
        System.out.println("enter  different files in the folder");
        for(int i=0;i<6;i++){
          String st=sc.next();
          File fi=new File(str+"/"+st);
          boolean bo=fi.createNewFile();
          if(st.endsWith(".txt")){
            textcount++;
          }
           else if(st.endsWith(".doc")){
            doccount++;
          }
         else if(st.endsWith(".jpeg")){
            imagecount++;
          }
           else{
            ocount++;
          }
          
        }
        System.out.println("Number of text files:"+textcount);
    System.out.println("Number of document files:"+doccount);
   System.out.println("Number of image files:"+imagecount);
    System.out.println("Number of other files:"+ocount);
      }catch(Exception e){
        System.out.println(e.getMessage());
      }

    }
}
