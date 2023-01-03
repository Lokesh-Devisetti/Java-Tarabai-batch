class Student1{
  private int a=10,b=20;
  
class Student2{
  void add(){
  System.out.println(a+b);
  }
}
}
class Student{
  public static void main(String args[]){
    Student1 st1=new Student1();
    Student1.Student2 st2=st1.new Student2();
    st2.add();
  }
}