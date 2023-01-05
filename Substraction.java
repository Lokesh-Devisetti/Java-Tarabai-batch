class Model implements Runnable{
  public void run(){
    int c=20-10;
    System.out.println("substarct two numbers:"+c);
  }
}
class Substraction{
  public static void main(String args[]){
    Model mo=new Model();
    Thread t1=new Thread(mo);
    t1.start();
    int d=20%5;
    System.out.println("modulus operation:"+d);
  }
}