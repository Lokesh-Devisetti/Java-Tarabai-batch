import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime nmuber");
        }

    }
}
