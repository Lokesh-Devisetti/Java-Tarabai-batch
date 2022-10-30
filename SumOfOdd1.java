import java.util.Scanner;
class SumOfOdd1 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int sum=0;
    int i=1;
    while(i<=n)
      {
        if(i%2==1)
        {
          sum=sum+i;
          }
        i++;
        }
    System.out.println(sum);
  }
}
