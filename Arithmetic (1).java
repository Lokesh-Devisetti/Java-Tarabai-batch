
class Operation extends Thread{
  public void run(){//running
    try{
    int a=10,b=15,c;
    
    c=a+b;
    System.out.println("addition of two numbers:"+c);
    Thread.sleep(1000);//waiting
      c=a-b;
      System.out.println("substraction of two numbers:"+c);
      Thread.sleep(1000);//waiting
      c=a*b;
      System.out.println("multiplication of two numbers:"+c);
      Thread.sleep(1000);//waiting
      c=a/b;
      System.out.println("division of two numbers:"+c);
      Thread.sleep(1000);//waiting
      
    }
    catch(InterruptedException e){
      System.out.println(e.getMessage());
    }
  }
}
class Arithmetic{
  public static void main(String args[]){
    Operation op=new Operation();//new 
    //Thread t1=new Thread(op);//new
    op.start();//runnalbe
  }
}