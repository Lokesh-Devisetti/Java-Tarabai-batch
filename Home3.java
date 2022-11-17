/*Create a class 'Student' with three data members which are name, age and address. The constructor of the class 
assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same 
name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method takes
 has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 
10 students.
Hint - Use array of objects*/
import java.util.*;
class Student{
  String name;
  int age;
  String address;
  // constructor
  Student(){
    this.name="unknown";
    this.age=0;
    this.address="not aviable";
  }
  void setInfo(int age,String name){
    this.age=age;
    this.name=name;
  }
  void setInfo(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
  }
}
class Home3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student s[]=new Student[10];
    for(int i=0;i<10;i++){
    s[i]=new Student();
      s[i].setInfo(sc.next(),sc.nextInt(),sc.next());
    }
    for(int i=0;i<10;i++){
      System.out.println(s[i].name+" "+s[i].age+" "+s[i].address);
    }
  }
}