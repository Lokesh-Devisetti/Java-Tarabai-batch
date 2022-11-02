import java.util.Scanner;

public class SumOfPrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Find sum of prime numbers upto : ");
        int upto = scanner.nextInt();
       int sum = 0,count;
      for(int number=1;number<=upto;number++)
        {
          count=0;
          for(int i=2;i<=number/2;i++)
            {
              if(number%i==0)
              {
                count++;
                break;
              }
            }
          if(count==0&&number!=1)
          {
            sum=sum+number;
          }
        }
      System.out.println("the sum of prime numbers"+sum);
    }
}
       