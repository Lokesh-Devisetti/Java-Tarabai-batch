import java.io.*;
 
 
class Input{
 
  public static void main(String args[]){

    try{
      FileOutputStream fout=new FileOutputStream("input.txt");
      String str="Hi, This is Sample data";
    
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