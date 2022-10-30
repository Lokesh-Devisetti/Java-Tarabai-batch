import java.util.Scanner;
class Even2 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int i=1;
    while(i<=n)//10
    
      {
        if(i%2==0)
        {
          System.out.println(i);
          
        }
        i++;
      }
  }
}


