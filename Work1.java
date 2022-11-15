import java.util.*;
class Student3{
  int roll;
  String name;
  int marks;
  char grade;
  String branch;
  Scanner sc=new Scanner(System.in);
  void input(){
    //int i=0;
    System.out.println("enter student roll number");
    roll=sc.nextInt();
    System.out.println("enter student name");
    name=sc.next();
    System.out.println("enter student marks");
    marks=sc.nextInt();
    System.out.println("enter grade");
    grade=sc.next().charAt(0);
    System.out.println("enter branch");
    branch=sc.next();
  }
  void display(){
    System.out.println("roll number"+roll);
     System.out.println("name"+name);
     System.out.println("marks"+marks);
     System.out.println("grade"+grade);
     System.out.println("branch"+branch);
  }
}
class Work1{
  public static void main(String args[]){
    Student3 stu[]=new Student3[5];
    for(int i=0;i<5;i++){
      stu[i]=new Student3();
      stu[i].input();
    }
    for(int i=0;i<5;i++){
      stu[i].display();
    }
  }
}