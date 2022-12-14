  import java.util.*;
class Employee1{
  private int empid;
  private String empname;
  private long empphone;
  private int salary;
  private String address;
 
  void setEmpid(int empid){
   this.empid=empid;
  }
  void setEmpname(String empname){
    this.empname=empname;
  }
  void setEmpphone(long empphone){
    this.empphone=empphone;
  }
  void setSalary(int salary){
    this.salary=salary;
  }
  void setAddress(String address){
    this.address=address;
  }
    //getters
  int getEmpid(){
    return this.empid;
  }
  String getEmpname(){
    return this.empname;
  }
  long getEmpphone(){
    return this.empphone;
  }
  int getSalary(){
    return this.salary;
  }
  String getAddress(){
    return this.address;
  }
  
}

class Employee {
  public static void main(String args[]) {
  Employee1 e[]=new Employee1[4];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++){
      e[i]=new Employee1();
      System.out.println("Enter employee"+(i+1)+" details");
    e[i].setEmpid(sc.nextInt());
    e[i].setEmpname(sc.next());
    e[i].setEmpphone(sc.nextLong());
    e[i].setSalary(sc.nextInt());
    e[i].setAddress(sc.next());
    System.out.println(e[i].getEmpid()+" "+e[i].getEmpname()+" "+e[i].getEmpphone()+" "+e[i].getSalary()+" "+e[i].getAddress());
    
    }
    
  }
}