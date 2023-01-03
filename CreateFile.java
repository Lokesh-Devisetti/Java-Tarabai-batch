import java.io.*;
class CreateFile{
 
  public static void main(String args[]){
    try{
       File file=new File("data.txt");
    if(file.createNewFile()){
      System.out.println(file.getName());
    }
    else{
      System.out.println("already existed");
    }
    }
    catch(IOException e){
      e.printStackTrace();
    }
   
    
    
  }
}