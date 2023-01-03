import java.util.*;
import java.io.*;
class InvalidAgeException extends Exception{
  public InvalidAgeException(String str){
    super(str);
  }
}
 
class AgeVote{
 
  public static void ageValidation(int age) throws InvalidAgeException{
    if(age>18){
      System.out.println("Eligible");
    }
    else{
      throw new InvalidAgeException("Under age");
    }
  }
  public static void main(String args[]){
try{
    ageValidation(12);
}
catch(InvalidAgeException e){
 e.printStackTrace();
  //System.out.println(e.getMessage());
}
  
    
    
  }
}
 