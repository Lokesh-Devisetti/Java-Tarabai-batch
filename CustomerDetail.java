import java.util.*;
class Customer{
  private int cid;
  private String cname;
  private long cpno;
  private String cadd;
  void setCid(int cid){
    this.cid=cid;
  }
  void setCname(String cname){
    this.cname=cname;
  }
  void setCpno(long cpno){
    this.cpno=cpno;
  }
  void setCadd(String cadd){
    this.cadd=cadd;
  }
  int getCid(){
    return cid;
  }
  String getCname(){
    return cname;
  }
  long getCpno(){
    return cpno;
  }
  String getCadd(){
    return cadd;
  }
}
  class CustomerDetail{
    public static void main(String args[]){
    Customer c[]=new Customer[4];
    Scanner sc=new Scanner(System.in);
     for(int i=0;i<3;i++){
      c[i]=new Customer();
    System.out.println("enter the customer"+(i+1)+" detils");
    
    c[i].setCid(sc.nextInt());
    c[i].setCname(sc.next());
    c[i].setCpno(sc.nextLong());
    c[i].setCadd(sc.next());
    System.out.println(c[i].getCid()+" "+c[i].getCname()+" "+c[i].getCadd()+" "+c[i].getCpno());
     }
    
  }
}