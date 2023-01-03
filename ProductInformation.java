import java.util.*;
class Product{
  int pid;
  String pname;
  int price;
  int quantity;
  Product(int pid,String pname,int price,int quantity){
    this.pid=pid;
    this.pname=pname;
    this.price=price;
    this.quantity=quantity;
    }
}
interface ProductDio{
  public void insert(ArrayList<Product> p);
  public void display(ArrayList<Product> p);
  public void update(ArrayList<Product> p,int pid);
  public void search(ArrayList<Product> p,int pid);
  public void delete(ArrayList<Product> p, int pid);
  public void viewOptions();
}
class ProductImp implements ProductDio{
  public void viewOptions(){
    System.out.println("0 for exit");
    System.out.println("1 for insert");
    System.out.println("2 for display");
    System.out.println("3 for update");
    System.out.println("4 for search");
    System.out.println("5 for delete");
  }
  public void insert(ArrayList<Product> p){
    Scanner sx=new Scanner(System.in);
    System.out.println("product 1 information");
    p.add(new Product(sx.nextInt(),sx.next(),sx.nextInt(),sx.nextInt()));
     System.out.println("product 2 information");
     p.add(new Product(sx.nextInt(),sx.next(),sx.nextInt(),sx.nextInt()));
    if(p.isEmpty()){
      System.out.println("not inserted");
    }
    else{
      System.out.println("inserted successfully");
    }
  }
   public void display(ArrayList<Product> p){
     for(Product obj:p){
       System.out.println(obj.pid+" "+obj.pname+" "+obj.price+" "+obj.quantity);
     }
   }
  public void update(ArrayList<Product> p,int pid){
    for(Product obj:p){
      if(obj.pid==pid){
        obj.pname="infinx";
      }
          System.out.println(obj.pid+" "+obj.pname+" "+obj.price+" "+obj.quantity);
      }
    }
  public void search(ArrayList<Product> p,int pid){
    for(Product obj:p){
      if(obj.pid==pid){
       System.out.println(obj.pid+" "+obj.pname+" "+obj.price+" "+obj.quantity);
    }
  }
  }
  public void delete(ArrayList<Product> p, int pid){
      Product prd=null;
    for(Product obj:p){
      if(obj.pid==pid){
        prd=obj;
      }
    }
      p.remove(prd);
      System.out.println("Deleted");
    }
  }


  class ProductInformation{
    public static void main(String args[]){
      ProductDio pd=new ProductImp();
      ArrayList<Product> list=new ArrayList<Product>();
    int num=0;
      do{
        pd.viewOptions();
        System.out.println("choose your option");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==1){
          pd.insert(list);
        }
        else if(num==2){
          pd.display(list);
        }
        else if(num==3){
          pd.update(list,1);
        }
        else if(num==4){
          pd.search(list,1);
        }
        else if(num==5){
          pd.delete(list, 2);
        }
        else if(num==0){
          System.out.println("invalid data");
        }
      }while(num!=0);
    }
  }
