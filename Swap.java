//wap to swap 2 numbers without using third variable
class Swap {
  public static void main(String args[]) {
    int a, b;
    a = 11;
    b = 10;
    System.out.println("before a swapping:"+a);
    System.out.println("before b swapping:"+b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("after a swapping:"+a);
    System.out.println("after b swapping:"+b);
  }
}