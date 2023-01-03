// Student
// rollno
// name
// marks
// grade

 

// 10 Information Arraylist

 

// StudentDao  interface
// inserting student
// searching for student
// dispaly all students
// updating student
// deleting student

 

// StudentDaoImpl class
// implement

 

// main class
// you can create object and you can perform operation
import java.util.*;
class Student{
  int rollno;
  int marks;
  String name;
  String grade;
  // constructor
  Student(int rollno,int marks,String name, String grade){
    this.rollno=rollno;
    this.marks=marks;
    this.name=name;
    this.grade=grade;
    
  }
}
//int ch;
//switch(ch){
//  case 1:
 //   insertStudent(ArrayList<Student> a);
 //   break;
 // case 2:
  //  serachStudent(ArrayList<Student> a,int rollno);
    
//}
interface StudentDao{
  public void insertStudent(ArrayList<Student> a);
  public void serachStudent(ArrayList<Student> a,int rollno);
  public void displayStudent(ArrayList<Student> a);
  public void updateStudent(ArrayList<Student> a,int rollno);
  public void deleteStudent(ArrayList<Student> a,int rollno);
}

 

class StudentDaoImpl implements StudentDao{
  public void insertStudent(ArrayList<Student> a){
   
    for(Student obj:a){
      System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
    }
  }
  public void serachStudent(ArrayList<Student> a,int rollno){
    for(Student obj:a){
      if(obj.rollno==rollno){
         System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
      }
      else{
        System.out.println("roll not matched");
      }
    }
  }
   public void displayStudent(ArrayList<Student> a){
     for(Student obj:a){
        System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
     }
   }
  public void updateStudent(ArrayList<Student> a,int rollno){
    for(Student obj:a){
      if(obj.rollno==rollno){
        obj.marks=400;
        System.out.println(obj.rollno+" "+obj.marks+" "+obj.name+" "+obj.grade);
      }
      else{
        System.out.println("Record not matched");
      }
    }
  }
  public void deleteStudent(ArrayList<Student> a,int rollno){
    Student std=null;
    for(Student obj:a ){
      if(obj.rollno==rollno){
        std=obj;
      }
      
    }
    if(std==null){
        System.out.println("invalid");
      }
      else{
        a.remove(std);
        System.out.println("Deleted ");
      }
  }
}

 


class StudentInfromation{
  public static void main(String args[]){
   Student s=new Student(1,300,"lokesh","A");//0
    Student sa=new Student(2,700,"rakesh","B");//1
    Student sb=new Student(3,600,"sai","C");//2
    Student sc=new Student(4,500,"venkat","D");//3
    Student sd=new Student(5,400,"shoyab","E");/
    StudentDao s1= new StudentDaoImpl();
    ArrayList<Student> a1=new ArrayList<Student>();
    a1.add(s);
    a1.add(sa);
    a1.add(sb);
    a1.add(sc);
    a1.add(sd);
    s1.insertStudent(a1);
    s1.serachStudent(a1,2);
    s1.displayStudent(a1);
    s1.updateStudent(a1,3);
    s1.deleteStudent(a1,3);
    s1.displayStudent(a1);
  }
}
 