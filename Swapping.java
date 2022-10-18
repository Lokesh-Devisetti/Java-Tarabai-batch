//wap to swap 2 numbers with using third variable
class Swapping 
{
  public static void main(String args[]) 
  {
    int a, b, temp;
    a = 10;
    b = 11;
    System.out.println("before a swapping:"+a);
    System.out.println("before b swapping:"+b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("after a swapping:"+a);
    System.out.println("after b swapping:"+b);

  }
}