//custom exception for name should be greaterthn 5 char invalid exception.
//custom exception marks should be lessthan 200 invalid marks
//read data from file we need to read sname and marks check two exceptions then we can print data.
import java.io.*;
//custom Exception
class InvalidNameException extends Exception{
  public InvalidNameException(String str){
    super(str);
  }
}
//custom exception
class InvalidMarksException extends Exception{
  public InvalidMarksException(String str){
    super(str);
  }
}
//main class
class StudentData{
  public static void main(String args[]) throws IOException{
    String filepath="studentdata.txt";
    try{
      BufferedReader br=new BufferedReader(new FileReader(filepath));
      String line=br.readLine();
      while(line!=null){
        String words[]=line.split(",");
        String name=words[1];
        int marks=Integer.parseInt(words[2]);
        try{
          if(name.length()<5){
            throw new InvalidNameException("Name should be atleast 5 characters:"+name);
          }
          if(marks<200){
            throw new InvalidMarksException("marks should be 0 to 200:"+marks);
          
          }
           System.out.println("names:"+name);
          System.out.println("marks:"+marks);
        }
       
        catch(Exception e){
          System.out.println(e.getMessage());
        }
        line=br.readLine();
      }
      
      
    }catch(IOException o){
      System.out.println(o.getMessage());
    }
  }
}