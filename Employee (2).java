class Employee1{
  int eid;
  String ename;
  String edept;
  int esalary;
  long ephoneno;
 void grossSalary(int bsalary){
    if(bsalary<10000){
      int gs=2000+2000+bsalary;
      System.out.println(gs);
    }
    else{
      int gs=1000+1000+bsalary;
      System.out.println(gs);
    }
  }

  void insurence(int bsalary){
    if(bsalary<10000){
      System.out.println("Not eligible");
    }
    else{
      System.out.println("eligible");
    }
  }
}

class Employee{
  public static void main(String args[]){
    Employee1 e1=new Employee1();
    e1.eid=12;
    e1.ename="lalitha";
    e1.edept="Accounts";
    e1.esalary=25000;
    e1.ephoneno=2345677L;
        System.out.println(e1.eid+" "+e1.ename+" "+e1.edept+" "+e1.esalary+" "+e1.ephoneno);
    e1.grossSalary(e1.esalary);
    e1.insurence(e1.esalary);

  }   
  }