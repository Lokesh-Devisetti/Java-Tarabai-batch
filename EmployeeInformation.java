import java.util.*;
class Employee{
  int eid;
  String name;
  long phonenumber;
  // constructor
  Employee(int eid,String name,long phonenumber){
    this.eid=eid;
    this.name=name;
    this.phonenumber=phonenumber;
    
    
  }
}

interface EmployeeDao{
  public void insertEmployee(ArrayList<Employee> a);
  public void searchEmployee(ArrayList<Employee> a,int eid);
  public void displayEmployee(ArrayList<Employee> a);
  public void updateEmployee(ArrayList<Employee> a,int eid);
  public void deleteEmployee(ArrayList<Employee> a,int eid);
}

 

class EmployeeDaoImpl implements EmployeeDao{
  public void insertEmployee(ArrayList<Employee> a){
   
    for(Employee obj:a){
      System.out.println(obj.eid+" "+obj.name+" "+obj.phonenumber);
    }
  }
 public void searchEmployee(ArrayList<Employee> a,int eid){
    for(Employee obj:a){
      if(obj.eid==eid){
          System.out.println(obj.eid+" "+obj.name+" "+obj.phonenumber);
      }
      else{
        System.out.println("employee id  not matched");
      }
    }
  }
    public void displayEmployee(ArrayList<Employee> a){
     for(Employee obj:a){
         System.out.println(obj.eid+" "+obj.name+" "+obj.phonenumber);
     }
   }
  public void updateEmployee(ArrayList<Employee> a,int eid){
    for(Employee obj:a){
      if(obj.eid==eid){
        obj.phonenumber=9949965871l;
        System.out.println(obj.eid+" "+obj.name+" "+obj.phonenumber);
      }
      else{
        System.out.println("Record not matched");
      }
    }
  }
 public void deleteEmployee(ArrayList<Employee> a,int eid){
    Employee emp=null;
    for(Employee obj:a ){
      if(obj.eid==eid){
        emp=obj;
      }
      
    }
    if(emp==null){
        System.out.println("invalid");
      }
      else{
        a.remove(emp);
        System.out.println("Deleted ");
      }
  }
}

 


class EmployeeInformation{
  public static void main(String args[]){
    Employee e=new Employee(123,"Lokesh",7013840036l);
    Employee e1=new Employee(125,"Sai",7012365478l);
    Employee e2=new Employee(150,"venkat",8096187565l);
    Employee e3=new Employee(140,"shoyab",7013840038l);
    Employee e4=new Employee(160,"rakesh",7894561230l);
    EmployeeDao s1= new EmployeeDaoImpl();
    ArrayList<Employee> a1=new ArrayList<Employee>();
    a1.add(e);
    a1.add(e1);
    a1.add(e2);
    a1.add(e3);
    a1.add(e4);
    s1.insertEmployee(a1);
    s1.searchEmployee(a1,150);
    s1.displayEmployee(a1);
    s1.updateEmployee(a1,125);
    s1.deleteEmployee(a1,140);
    s1.displayEmployee(a1);
  }
}
 