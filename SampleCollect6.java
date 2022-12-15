import java.util.*;
class Product{
  private int pid;//instance 
  private String pname;
  private int pqty;
  private int price;
  //setters and getters
  //assign the values to private variables
//this is call the current class instance variable
  void setPid(int pid){//local variable
   this.pid=pid;
  }
  void setPname(String pname){
    this.pname=pname;
  }
  void setPqty(int pqty){
    this.pqty=pqty;
  }
  void setPrice(int price){
    this.price=price;
  }
    //getters
  int getPid(){
    return this.pid;
  }
  String getPname(){
    return this.pname;
  }
  int getPqty(){
    return this.pqty;
  }
  int getPrice(){
    return this.price;
  }
  Product(){
    System.out.println("Constructor called");
  }
  Product(int pid,String pname,int pqty,int price){
    this.pid=pid;
    this.pname=pname;
    this.pqty=pqty;
    this.price=price;
  }
  Product(int pid){
    this.pid=pid;
  }
  Product(int pid,String pname){
    this.pid=pid;
    this.pname=pname;
  }

 

}

 

class SampleCollect6 {
  public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
    List<Product> list=new ArrayList();
    list.add(new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
    list.add(new Product(145,"Mango",23,200));
    list.add(new Product(123,"Banana",25,185));
    list.add(new Product(123,"Orange",19,210));

 

    for(Product p:list)
      {
        System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPqty()+" "+p.getPrice());
      }

 

  }
}