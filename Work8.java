class Address{
  String state;
  String city;
  String streetname;
  int drno;
  Address(String state,String city,String streetname,int drno){
    this.state=state;
    this.city=city;
    this.streetname=streetname;
    this.drno=drno;
  }
}
class Employee{
  int eid;
  String ename;
  String edept;
  int esalary;
  Address address;

  Employee(int eid,String ename,String edept,int esalary,Address address){
    this.eid=eid;
    this.ename=ename;
    this.edept=edept;
    this.esalary=esalary;
    this.address=address;
  }
  void display(){
    System.out.println(eid+" "+ename+" "+edept+" "+esalary);
    System.out.println(address.state+" "+address.city+" "+address.streetname+" "+address.drno);
}
}
class Work8{
  public static void main(String args[]){
    Address address1=new Address("AP","Tiruvuru","ayyappa colony",55);
    Address address2=new Address("AP","Mylavaram","anjaneya Colony",123);

    Employee emp1=new Employee(536,"lokesh","developers",25000,address1);
    Employee emp2=new Employee(541,"sai","IT",20000,address2);
    emp1.display();
    emp2.display();
    
   
  }
}