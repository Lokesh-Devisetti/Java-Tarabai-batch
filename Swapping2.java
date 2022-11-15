// swap of two number;
 //  without return type and without parameters.
class Swapping2 {
  static void swap(){
  int a=10,b=11;
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println(a+" "+b);
  }
  public static void main(String args[]) {
    swap();
  }
}