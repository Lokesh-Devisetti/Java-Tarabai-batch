import java.io.*;
 
 
class Data{
 
  public static void main(String args[]){

    try{
      FileOutputStream fout=new FileOutputStream("data.txt");
      String str="hi hi hi bitlabs thank you for giving this all bitlabs hi";
    
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