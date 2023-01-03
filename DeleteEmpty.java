/*5. Suresh wants to delete empty files from his local machine, help him to write a Java program to accept path and delete empty files.
Note: Please specify the file count before deletion and after deletion. and display the count that are deleted.
 
Sample input:
Enter path: C://Users/Mydata
 
Expected Ouput:
Before deletion the file count is: 30
After deletion the file count is : 23
7 files Deleted successfully.*/
import java.io.*;
import java.util.*;
class DeleteEmpty{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter path:");
    String path=sc.next();
    File file=new File(path);
    File data[]=file.listFiles();//file format
    int filecount=data.length;
    System.out.println("before deletion the empty data:"+filecount);
    int deletecount=0;
    for(File fi:data){
      if(fi.length()==0){
        fi.delete();
        deletecount++;
      }
    }
    System.out.println(deletecount+"Deleted successfully.");
    System.out.println("after deletion empty files:"+(filecount-deletecount));
  }
}

