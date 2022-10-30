import java.util.*;
class SumOfNatural2{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int i=1;
    int sum=0;
     do{
       sum=sum+i;
       i++;
     }while(i<=n);
   System.out.println(sum);
}
  }