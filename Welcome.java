import java.io.*;
 
 
class Welcome{
 
  public static void main(String args[]){

    try{
      FileOutputStream fout=new FileOutputStream("welcome.txt");
      String str="Welcome to bitLabs";
    
      byte b[]=str.getBytes();
    fout.write(b);
    fout.close();
      System.out.println("Success");
     
    }
    catch(IOException e){
      e.printStackTrace();
    }
    
 }
  }