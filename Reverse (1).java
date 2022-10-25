import java.util.Scanner;
public class Reverse{
    public static void main(String args[])
    {
        int number,reminder,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any number you want to reverse:");
        number=sc.nextInt();
        while(number>0){
            reminder=number%10;
            rev=rev*10+reminder;
            number=number/10;
        }
        System.out.println("reverse of entered number is ="+rev);
    }
}