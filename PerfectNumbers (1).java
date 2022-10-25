import java.util.*;
public class PerfectNumbers
{
public static void main(String arg[])
{
int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter value:");
  int n=sc.nextInt();
for(int i=0;i<n;i++)
{
sum=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
{
sum=sum+j;
}
}
if(sum==i && sum!=0)
System.out.print(i+"\t");
}
}
}