/*When we get the address from the user some have entered in comma separated format rather than in specific fields. So we need a program that can split the address into appropriate fields and create an object from it. Let's write it and display the address that has been split in tabular form.
Create a class Address with following private attributes

Attributes
DataType

userId
Integer

street
String

city
String

state
String

Include appropriate getters and setters
Create default constructor and a parameterized constructor with arguments in order Address(Integer userId, String street, String city, String state).
 
Create a driver class named Main to test the above class.
 
Display the address in a tabular format using format method - System.out.format("%-15s %-15s %-15s %s\n", "User ID","Street","City","State").*/
import java.util.*;
 class Address1{
   private int id;
   private String street;
   private String city;
   private String state;
   void setId(int id){
     this.id=id;
   }
   void setStreet(String street){
     this.street=street;
   }
   void setCity(String city){
     this.city=city;
   }
   void setState(String state){
     this.state=state;
   }
   int getId(){
     return id;
   }
    String getStreet(){
     return street;
   }
   String getCity(){
     return city;
   }
   String getState(){
     return state;
   }
   Address1(int id,String street,String city ,String state){
     this.id=id;
     this.street=street;
     this.city=city;
     this.state=state;
   }
 }
class Address2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str2[]=new String[4];
    str2=str.split(",");
    Address1 ad=new Address1(Integer.parseInt(str2[0]),str2[1],str2[2],str2[3]);
    System.out.format("%-15s %-15s %-15s %s\n", "User ID","Street","City","State");
     System.out.format("%-15s %-15s %-15s %s\n",ad.getId(),ad.getStreet(),ad.getCity(),ad.getState());
    
    
  }
}