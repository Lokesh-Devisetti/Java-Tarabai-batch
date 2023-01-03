import java.util.*;

 
class Product {
  int pid;
  String pname;
  int price;
  Product(int pid,String pname,int price){
    this.pid=pid;
    this.pname=pname;
    this.price=price;
  }
}
class PidComparator implements Comparator<Product>{
 
  public int compare(Product pd1,Product pd2){
    if(pd1.pid==pd2.pid)
      return 0;
    else if(pd1.pid>pd2.pid)
      return 1;
    else
      return -1;  
  }
  
}
class PnameComparator implements Comparator<Product>{
  public int compare(Product pd1,Product pd2){
    return pd1.pname.compareTo(pd2.pname);
  }
}
  class PriceComparator implements Comparator<Product>{
     public int compare(Product pd1,Product pd2){
    if(pd1.price==pd2.price)
      return 0;
    else if(pd1.price>pd2.price)
      return 1;
    else
      return -1;  
  }
  
}
class ProductInfo{
  public static void main(String args[]){
  ArrayList<Product> list=new ArrayList<Product>();
 
    
    list.add(new Product(123,"iphone",35000));
    list.add(new Product(120,"realame",20000));
    list.add(new Product(567,"smart watches",3000));
    list.add(new Product(789,"kithcen items",1500));
    Collections.sort(list,new PidComparator());
    System.out.println("Sorting based on rollno");
    
      for(Product prd:list){
        System.out.println(prd.pid+" "+prd.pname+" "+prd.price);
      }
 
      Collections.sort(list,new PnameComparator());
     System.out.println("Sorting based on name");
      for(Product prd:list){
        System.out.println(prd.pname+" "+prd.pid+" "+prd.price);
      }
   Collections.sort(list,new PriceComparator());
     System.out.println("Sorting based on price");
      for(Product prd:list){
        System.out.println(prd.price+" "+prd.pid+" "+prd.pname);
      }
  }
}