import java.util.*;
class SumOfNatural1{
  public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int i=1;
    int sum=0;
     while(i<=n){
       sum=sum+i;
       i++;
     }
   System.out.println(sum);
}
  }