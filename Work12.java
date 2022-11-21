class Student{
  private int rollno;
  private String name;

 


  //setters are used to assign the value
  void setRollno(int rollno){
    this.rollno=rollno;
  }
  void setName(String name){
    this.name=name;
  }

 

  //getters are used to print the data
  int getRollno(){
    return rollno;
  }
  String getName(){
    return name;
  }
}
class Work12{
  public static void main(String args[]){
    Student st=new Student();
    st.setRollno(536);
    st.setName("lokesh");
    System.out.println(st.getRollno()+" "+st.getName());
  }
}