//using extends
class Mathematics extends Thread{
  public void run(){
    int c=10+20;
    System.out.println("Additon of two number:"+c);
  }
}
class Additon{
  public static void main(String args[]){
    Mathematics ma=new Mathematics();
    ma.start();
    int d=10*20;
    System.out.println("mulitiplication of two numbers:"+d);
  }
}