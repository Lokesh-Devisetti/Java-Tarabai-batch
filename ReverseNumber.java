import java.util.*;
class ReverseNumber {
  public static void main(String args[]) {
    int rem,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int num=sc.nextInt();
    while(num>0)//2587,258,25,2,0
      {
        rem=num%10;//2587%10=7,258%10=8,25%10=5,2%10=2
        rev=rev*10+rem;//0*10+7,7*10+8=78,78*10+5=785,785*10+2=7852
        num=num/10;//2587/10,258/10=25,25/10=2,2/10=0
      }
    System.out.println("reverse of that number is:"+rev);//7,78,785,7852
  }
}