/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
class Member{
  String name;
  int age;
  long phone_number;
  String address;
  int salary;
  void printSalary(){
    System.out.println("print slary:"+salary);
  }
  }
class Employe extends Member{
  String specialization;
  String department;
  
}
class Manager extends Member{
  String specialization;
  String department;
}
class Member1{
  public static void main(String args[]){
    Employe emp=new Employe();
    emp.name="Lokesh";
    emp.age=23;
    emp.phone_number=7013840036l;
    emp.address="chittela(v),tiruvuru(m),NTR(dist),Andhra Pradesh";
    emp.salary=25000;
    emp.specialization="B.tech";
    emp.department="Developer";
   
    System.out.println(emp.name+" "+emp.age+" "+emp.phone_number+" "+emp.address+" "+emp.salary+" "+emp.specialization+" "+emp.department);
     emp.printSalary();
    Manager ma=new Manager();
    ma.name="Lalitha";
    ma.age=28;
    ma.phone_number=8524713654l;
    ma.address="main road,anjaneya street,tiruvuru,andhra pradesh";
    ma.salary=40000;
    ma.specialization="M.tech";
    ma.department="Senior developer";
     System.out.println(ma.name+""+ma.age+" "+ma.phone_number+" "+ma.address+" "+ma.salary+" "+ma.specialization+" "+ma.department);
    ma.printSalary();
    
  }
}