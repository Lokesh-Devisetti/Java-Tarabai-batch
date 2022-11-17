/*Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with
 the same name 'printn' having a parameter for each datatype.*/
class PrintNumber{
  void printn(int a, int b){
    System.out.println(a+ " "+b);
  }
  void printn(int a, int b,int c){
    System.out.println(a+ " "+b+" "+c);
  }
  void printn(float a, int b){
    System.out.println(a+ " "+b);
  }
  void printn(float a, float b){
    System.out.println(a+ " "+b);
  }
}
class Home1{
  public static void main(String args[]){
    PrintNumber pn=new PrintNumber();
    pn.printn(12,20);
    pn.printn(15,52,87);
    pn.printn(12.8f,15);
    pn.printn(85.2f,25.2f);
  }
}