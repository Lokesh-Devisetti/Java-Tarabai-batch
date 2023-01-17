import java.io.*;
 
 
class Long{
 
  public static void main(String args[]){

    try{
      FileOutputStream fout=new FileOutputStream("long.txt");
      String str="Welcome to bitlabs";
    
      byte b[]=str.getBytes();
    fout.write(b);
      String str1="Here we provide the data";
      byte b1[]=str1.getBytes();
      fout.write(b1);
      String str2="we clear all the doubts";
      byte b2[]=str2.getBytes();
      fout.write(b2);
    fout.close();
      System.out.println("Success");
     
    }
    catch(IOException e){
      e.printStackTrace();
    }
    
  }
     }