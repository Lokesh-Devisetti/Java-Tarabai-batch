/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
 public class NullPointerException {
    // Main method
    public static void main(String args[]) {
      // Here, we are initializing obj as 'null'. So, anything that is referring with object will throw NullPointerException.
      Student obj=null;
  // All these methods don't work because of NullpointerException.
      try{
       // Call the methods to initialize
      obj.setName("sarath");
      obj.setMarks(10);
      obj.setCity("vizag");
        // Call the methods to print
       System.out.println(obj.getName()+" "+obj.getMarks()+" "+ obj.getCity());
            }
      
       catch(Exception e){
      System.out.println(e);
         
    }
    
  System.out.println("Exception handled");
      
    }
}
 // Student class
 class Student {
   // Initialize variables
  private String name;
  private int marks;
  private String city;
   Student(String name,int marks,String city){
     this.name=name;
     this.marks=marks;
     this.city=city;
   }
  // Setter methods
  public void setName(String name) {
    this.name=name;
  }
  public void setMarks(int marks) {
    this.marks=marks;
  } 
  public void setCity(String city) {
    this.city=city;
  }
  
  // Getter methods
  public String getName() {
    return name;
  }
  public int getMarks() {
    return marks;
  }
  public String getCity() {
    return city;
  }
}

