/* Write a Java program to read data from data.txt file using BufferedReader class and find following
-->Number of lines
--> Number of words
--> Number of characters (including spaces)
--> Number of characters (excluding spaces)*/
import java.io.*;
class Data{
  public static void main(String args[]) throws IOException{
    int count=0,ncount=0,ccount=0,nscount=0;
    BufferedReader b=new BufferedReader(new FileReader("studentdata.txt"));
    String str;
    //Number of lines
  
    while((str=b.readLine())!=null){
      if(str!=null){
      count++;
      
      }
      if(str!=null){
        String[] str1=str.split(",");
    
    //for(int i=0;i<str1.length;i++){
      ncount=ncount+str1.length;
   
    }
      ccount=ccount+str.length();
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)!=' '){
          nscount++;
        }
      }
      
  
      }
    System.out.println("number of lines:"+count);
    System.out.println("number of words:"+ncount);
    System.out.println("number of characters:"+ccount);
    System.out.println("number of space:"+nscount);
    // System.out.println("number of lines:"+count);
    
    //while((str=b.readLine())!=null){
    
   
  }
}
