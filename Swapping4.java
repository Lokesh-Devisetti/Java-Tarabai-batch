
 //  with return type and without parameters.
class Swapping4 {
  static void swap(int a, int b){
  a=a+b;
  b=a-b;
  a=a-b;
 System.out.println(a+" "+b);
  }
  public static void main(String args[]) {
    swap(10,20);
    
  }
}