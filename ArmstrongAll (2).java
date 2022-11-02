import java.util.*;
public class ArmstrongAll
{
    public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0;
       Scanner sc=new Scanner(System.in);
        System.out.print("Armstrong numbers from 1 to n:");
      int  num=sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}