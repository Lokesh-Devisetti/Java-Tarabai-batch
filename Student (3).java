import java.util.*;
class Student1{
  private int id;
  private String name;
  private int marks;
  private long phonenumber;
  private String address;

  //setters
  void setId(int id){
    this.id=id;
  }
  void setName(String name){
    this.name=name;
  }
   void setMarks(int marks){
    this.marks=marks;
  }
   void setPhonenumber(long phonenumber){
    this.phonenumber=phonenumber;
  }
  void setAddress(String address){
    this.address=address;
  }

  //getters 
  int getId(){
    return this.id;
  }
  String getName(){
    return this.name;
  }
  int getMarks(){
    return this.marks;
  }
  long getPhonenumber(){
    return this.phonenumber;
  }
  String getAddress(){
    return this.address;
  }
}
class Student{
  public static void main(String[]args){
    Student1 s[]=new Student1[4];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++){
      s[i]=new Student1();
    System.out.println("enter the student"+(i+1)+ " detils");
    
    s[i].setId(sc.nextInt());
    s[i].setName(sc.next());
    s[i].setMarks(sc.nextInt());
    s[i].setPhonenumber(sc.nextLong());
    s[i].setAddress(sc.next());
    System.out.println(s[i].getId()+" "+s[i].getName()+" "+s[i].getMarks()+" "+s[i].getPhonenumber()+" "+s[i].getAddress());
  }
    
}
}