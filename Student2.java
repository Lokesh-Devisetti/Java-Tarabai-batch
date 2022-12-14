import java.util.*;
abstract class Studen{
  int id;
  String name;
 
  public void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter id");
    id=sc.nextInt();
    System.out.println("Enter name");
    name=sc.next();  
  }
  public void display(){
    System.out.println(id+ " "+name);
    
  }
  abstract void grade();
}
class Studen1 extends Studen{
 
  public void grade(){
    int marks=23;
    if(marks>90){
      System.out.println("GRADE A");
    }
    else if(marks>80 && marks<90){
      
     System.out.println("GRADE B");
    }
    else{
      System.out.println("fail");
    }
  }
}
class Student2{
  public static void main(String args[]){
    Studen std=new Studen1();
    std.read();
    std.display();
    std.grade();
  }
}
