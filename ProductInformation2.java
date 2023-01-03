import java.util.*;

 
class Product implements Comparable<Product>{
  int pid;
  String pname;
  int price;
  Product(int pid,String pname,int price){
    this.pid=pid;
    this.pname=pname;
    this.price=price;
  }
  // public int compareTo(Product pd){
  //   if(pid==pd.pid)
  //     return 0;
  //   else if(pid>pd.pid)
  //     return 1;
  //   else
  //     return -1;
    
  // }
//   public int compareTo(Product pd){
//     return pname.compareTo(pd.pname);
// }
  public int compareTo(Product pd){
    if(price==pd.price)
      return 0;
    else if(price>pd.price)
      return 1;
    else
      return -1;
    
  }
}
class ProductInformation2{
  public static void main(String args[]){
  ArrayList<Product> list=new ArrayList<Product>();
 
    
    list.add(new Product(123,"iphone",35000));
    list.add(new Product(120,"realame",20000));
    list.add(new Product(567,"smart watches",3000));
    list.add(new Product(789,"kithcen items",1500));
    Collections.sort(list);
    
      for(Product prd:list)
        System.out.println(prd.price+" "+prd.pname+" "+prd.pid);
      }
   
  }