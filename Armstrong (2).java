import java.util.Scanner;
public class Armstrong
{
    public  static void main(String args[])
    {
        int num,temp,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        num=sc.nextInt();
        temp=num;
        while(num!=0){
            int d=num%10;
            c=c+(d*d*d);
            num=num/10;
        }
        if(temp==c){
            System.out.println("numbers is armstrong");
        }
        else{
            System.out.println("numbers is not armstrong");
        }
    }
}