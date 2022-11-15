
 //  with return type and without parameters.
class Swapping3 {
  static int swap(){
  int a=10,b=11;
  a=a+b;
  b=a-b;
  a=a-b;
  return a;
  return b;
  }
  public static void main(String args[]) {
    int result=swap();
    System.out.println(a+" "+b);
  }
}