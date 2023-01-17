/* 1. Write a Java program to get a list of all files/directory names from the given path using File class object.*/
import java.io.*;
public class FilesDirectory {

    public static void main(String args[]) {  
           String arr[];
      try{
        File f=new File("Folder");
        arr=f.list();
        for(String str:arr){
          System.out.println(str);
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
      System.out.println("successfully folder added");
    }
}

