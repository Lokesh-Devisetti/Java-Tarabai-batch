/*Suppose we want to store the information about students and teachers in a school. The information to be stored includes the name, age and marks of students and the name, age and salary of the teachers.
Here, name and age have to be stored for both students and teachers and we also know that both students and teachers are persons.
Therefore, we can make Person as a class with name and age as attributes, and can make Student and Teacher as the subclasses of Person. In the Student class, we can define an additional marks attribute and in the Teacher class an additional salary attribute.
Now let’s implement this in Java using super wherever necessary.*/
class Person{
  String name;
  int age;
  Person(String name,int age){
    this.name=name;
    this.age=age;
  }
}
class Students extends  Person{
  int marks;
  Students(String name,int age,int marks){
    super(name,age);
    this.marks=marks;
  }
  void display(){
    System.out.println(name+" "+age+" "+marks);
  }
}
class Teachers extends Person{
  int salary;
  Teachers(String name,int age,int salary){
    super(name,age);
    this.salary=salary;
  }
  void display(){
    System.out.println(name+" "+age+" "+salary);
  }
}
class School{
  public static void main(String args[]){
    Teachers te=new Teachers("lalitha",28,50000);
    Students st=new Students("lokesh",22,595);
    te.display();
    st.display();
  }
}