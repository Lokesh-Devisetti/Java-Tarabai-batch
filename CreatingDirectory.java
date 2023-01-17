/* 5. Write a Java program to accept directory name, file name from user. Do the following steps using File class.
   ==> Create directory with user entered directory name
   ==> Create file in given directory.
   ==> Accept one sentence about bitLabs and store in give file using FileOutputStream class.
   ==> Read data from given file and display read data on console using FileInputStream class.
*/
import java.io.*;
import java.util.*;
public class CreatingDirectory {

    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      try{
        System.out.println("Enter directory name:");
        String st=sc.next();
        File f=new File(st);
        boolean bool=f.mkdir();
        if(bool){
          System.out.println("directory created");
        }
        System.out.println("enter file name:");
        String str=sc.next();
        File fe=new File(st+"/"+str);
        boolean bo=fe.createNewFile();
        if(bo){
          System.out.println("File created");
        }
        FileOutputStream fos=new FileOutputStream(fe);
        String str1="write about bitLabs";
        fos.write(str1.getBytes());
        FileInputStream fis=new FileInputStream(fe);
        int i;
        while((i=fis.read())!=-1){
          System.out.print((char)i);
        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
}
